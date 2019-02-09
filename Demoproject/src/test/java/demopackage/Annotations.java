package demopackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void beforeSuite()
	{
	System.out.println("I am the head for this execution");
	}
	@AfterSuite
	public void afterSuite()
	{
	System.out.println("I am the tail for this execution");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("1Where am I?");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("2Where am I?");
	}
	@Test
	public void testCase1()
	{
		System.out.println("1st testcase");
	}
	@Test
	public void testCase2()
	{
		System.out.println("2st testcase");
	}
    @BeforeMethod
    public void beforeMethod()
    {
    	System.out.println("I execute before tc1 and tc2 execution");
    }
    @AfterMethod
    public void afterMethod()
    {
    	System.out.println("I execute after tc1 and tc2 execution");
    }
    @BeforeTest
    public void beforeTest()
    {
    	System.out.println("I am the first to print before @test,@before and after methods but after beforesuite");
    }
    @AfterTest
    public void afterTest()
    {
    	System.out.println("I am the last to print after @test,@before and after methods but before aftersuite");
    }
}
