package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass {
	
	
	
	@Test(dependsOnMethods="test2")
	public void test1() {
		System.out.println("Inside Home loan test one");
	}
	@Test
	
	public void test2() {
		System.out.println("Inside Home Loan test two");
	}
	
	}

