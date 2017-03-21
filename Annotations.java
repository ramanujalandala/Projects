package Testngfiles;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class Annotations {
		
		@BeforeMethod
		public void UseridGeneration()
		{
			System.out.println("This block executes before each Test");
		}
		@BeforeTest
		public void Cookies()
		{
			System.out.println("This block executes Before all  Testcases");
		
		}
	@AfterTest
	public void Cookiesclose()
	{
		System.out.println("This block executes after all  Testcases");
		
	}
	@AfterMethod
	public void Reportadding()
	{
		System.out.println("This block executes after each Test");
	}
		@Test
		public void OpeningBrowser()
		{
		
		System.out.println("Executing Test 2");

	}
	@Test
	public void FlightBooking()
	{
		System.out.println("Executing Test 1");
	}

}
