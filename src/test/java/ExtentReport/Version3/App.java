package ExtentReport.Version3;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    @BeforeClass
    public void g() {
    	System.out.println("this is before class");
    }
    @BeforeTest
    public void g1() {
    	System.out.println("this is before Test");
    }
    @BeforeSuite
    public void g2() {
    	System.out.println("this is before suite");
    }
}
