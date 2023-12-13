package practice;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadDataFromPDF {

	public static void main(String[] args) throws Throwable {
File fpdf=new File("./src/test/resources/Samplepdfselenium.pdf");
PDDocument doc=new PDDocument().load(fpdf)
;
int pages=doc.getNumberOfPages();
System.out.println(pages);

PDFTextStripper content=new PDFTextStripper();
String EntirePdf=content.getText(doc);
System.out.println(EntirePdf);

content.setStartPage(1);
String data = content.getText(doc);
System.out.println(data);
	}

}
