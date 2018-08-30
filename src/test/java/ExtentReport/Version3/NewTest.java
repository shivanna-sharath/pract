package ExtentReport.Version3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class NewTest {
	public static void main(String[] args) {
		System.out.println("this is main");
	}
  @Test
  public void f() {
	  System.out.println("this is test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is suite");
  }

}
