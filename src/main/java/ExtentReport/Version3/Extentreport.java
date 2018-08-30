package ExtentReport.Version3;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreport {
	WebDriver driver;
	Date date = new Date();
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
	String s=dateFormat.format(date);
	ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/ rep"+s+".html");
	ExtentReports extent= new ExtentReports();
	
	public void login() throws IOException {
		String chromePath = "C:\\Users\\M1046989\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		System.out.println("in login1");

		extent.attachReporter(report);
		ExtentTest logger=extent.createTest("login");
		logger.log(Status.PASS,"loginsucessful");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		logger.addScreenCaptureFromPath("C:\\Users\\M1046989\\Pictures\\Screenshots\\pic.jpg");
		driver.close();

	}
public void logout() throws IOException {
	extent.attachReporter(report);
	System.out.println("in login2");
		ExtentTest logger1=extent.createTest("log off");
		logger1.log(Status.FAIL,"not succesful");
		logger1.addScreenCaptureFromPath("C:\\Users\\M1046989\\Pictures\\Screenshots\\pic1.jpg");
		extent.flush();
		
		
		
	}
public void logout2() throws IOException {
	System.out.println("in login3");
	extent.attachReporter(report);

		ExtentTest logger1=extent.createTest("log off");
		logger1.log(Status.FAIL,"not succesful");
		logger1.addScreenCaptureFromPath("C:\\Users\\M1046989\\Pictures\\Screenshots\\pic2.jpg");
		extent.flush();
		
		

}
}
