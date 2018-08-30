package ExtentReport.Version3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.FileUtil;
import com.google.common.io.Files;

public class call extends JFrame {
	int i=0;
	public static JProgressBar pb;
	public call() {
		pb=new JProgressBar();
		pb.setBounds(50, 50, 250, 30);
		pb.setValue(0);
		pb.setStringPainted(true);
		this.add(pb);
		this.setSize(450,450);
		this.setLayout(null);
	}
	
	
	
	
	public String scrFolder;
	@BeforeTest
	public void a() {
		try {
			String src = "D:\\testcases";
			File dest = new File(src);

		    FileUtils.cleanDirectory(dest); 
		} catch (IOException e) {
		    e.printStackTrace();
		}
		 scrFolder = "D:/testcases/"
	            + new SimpleDateFormat("yyyy_MM_dd_HHmmss").format(
	                    Calendar.getInstance().getTime()).toString();
	    new File(scrFolder).mkdir();
	  
	    call a=new call();
	    a.setVisible(true);
	  
		
	}
	
@Test
	public static void main() throws IOException, InterruptedException {
		Extentreport i=new Extentreport();
		i.login();
		Thread.sleep(2000);
		i.logout();
	
		pb.setValue(33);

	}
@Test
public static void main1() throws IOException {
	Extentreport i=new Extentreport();
	i.login();
	i.logout();
	pb.setValue(33);

}
@Test
public static void main3() throws IOException {
	Extentreport i=new Extentreport();
	i.login();
	i.logout();
	i.logout2();
	pb.setValue(34);
}
@AfterClass
public void b() {
	
	
	String source = "C:\\Users\\M1046989\\eclipse-workspace\\Version3\\reports";
	File srcDir = new File(source);

	String destination = scrFolder;
	File destDir = new File(destination);

	try {
	    FileUtils.copyDirectory(srcDir, destDir);
	    FileUtils.cleanDirectory(srcDir); 
	} catch (IOException e) {
	    e.printStackTrace();
	}
	
}
	@AfterTest
	public void z() {
		System.out.println("inside after suite");
		ExtentHtmlReporter report1=new ExtentHtmlReporter("C:\\Users\\M1046989\\eclipse-workspace\\Version3\\Alltestcase\\ rep.html");
		ExtentReports extent1= new ExtentReports();
		extent1.attachReporter(report1);
		ExtentTest logger=extent1.createTest("all test casees");
		logger.log(Status.INFO," <a href = 'D:\\testcases'>test cases</a>");
		extent1.flush();
	}
	 
}



