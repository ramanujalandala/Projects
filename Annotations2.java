package Testngfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.testng.annotations.Test;

public class Annotations2 {
@Test
public void Login() throws IOException
{
	Properties prop= new Properties();
	FileInputStream fis =new FileInputStream("C:\\Coderepository\\Frameworks\\src\\Testngfiles\\Datadriven.properties");
	 prop.load(fis);
	 System.out.println(prop.getProperty("password"));
	 
	 		
	
}




}
