package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeTest(alwaysRun=true)
	public void  method3() {
		System.out.println("Inside before test");
	}
	
	@BeforeMethod
	public void method1() {
		System.out.println("OInside  brfore moethod");
	}
		@AfterMethod
		public void method2()
		{
			System.out.println("Inside the After Moethod ");
		}
		@AfterTest
		public void method4()
		{
			
		}

}

