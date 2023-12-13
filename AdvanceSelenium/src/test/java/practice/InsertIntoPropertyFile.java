package practice;

import java.io.FileOutputStream;
import java.util.Properties;

public class InsertIntoPropertyFile {


	public static void main(String[] args) throws Throwable   {
Properties pro=new Properties();
pro.setProperty("username", "standard_user");
pro.setProperty("password", "secret_sauce");
pro.setProperty("url", "https://www.saucedemo.com/v1/" );

FileOutputStream fos=new FileOutputStream("./src/test/resources/Ex.properties");
pro.store(fos,"DATA");
System.out.println("data written successfully");
	}

}
