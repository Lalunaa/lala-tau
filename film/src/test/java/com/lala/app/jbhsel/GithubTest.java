package com.lala.app.jbhsel;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
//import org.junit.Ignore;

public class GithubTest {

	private static WebDriver driver;
	WebElement element;

	@BeforeClass
	public static void driverSetup() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);
		caps.setCapability("takesScreenshot", true);
		caps.setCapability(
				PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
				"C:/Users/Lala/Downloads/phantomjs-2.1.1-windows/phantomjs-2.1.1-windows/bin/phantomjs.exe"
		);
		driver = new PhantomJSDriver(caps);
	}

	@AfterClass
	public static void cleanp() {
		driver.quit();
	}

	@Test
	public void findChampionsClass() throws IOException {
		driver.get("https://github.com/Lalunaa");
		WebElement e;
		e = driver.findElement(By.partialLinkText("lala-tau"));
		assertEquals(e.getAttribute("href"), "https://github.com/Lalunaa/lala-tau");
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("1.png"));
		e.click();
		screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("2.png"));
		
		e = driver.findElement(By.partialLinkText("film"));
		assertEquals(e.getAttribute("title"), "film");
		e.click();
		screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("3.png"));

		e = driver.findElement(By.partialLinkText("src"));
		assertEquals(e.getAttribute("title"), "src");
		e.click();
		screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("4.png"));

		e = driver.findElement(By.partialLinkText("main"));
		assertEquals(e.getAttribute("title"), "main");
		e.click();
		screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("5.png"));

		e = driver.findElement(By.partialLinkText("java"));
		assertEquals(e.getAttribute("title"), "java");
		e.click();
		screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("6.png"));

		e = driver.findElement(By.partialLinkText("com/lala/app"));
		assertEquals(e.getAttribute("href"), "https://github.com/Lalunaa/lala-tau/tree/master/film/src/main/java/com/lala/app");
		e.click();
		screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("7.png"));

		e = driver.findElement(By.partialLinkText("domain"));
		assertEquals(e.getAttribute("title"), "domain");
		e.click();
		screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("8.png"));		

		e = driver.findElement(By.partialLinkText("Movie.java"));
		assertEquals(e.getAttribute("title"), "Movie.java");

	}
}