package selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\setupfile\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		/*
		 * driver.findElement(By.id("alertButton")).click();
		 * driver.switchTo().alert().accept();
		 * driver.findElement(By.id("timerAlertButton")).click(); WebDriverWait wait =
		 * new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.alertIsPresent());
		 * driver.switchTo().alert().accept();
		 * driver.findElement(By.id("confirmButton")).click();
		 * driver.switchTo().alert().dismiss();
		 * driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 * 
		 * WebElement element = driver.findElement(By.id("promtButton"));
		 * ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		 * Alert promptAlert = driver.switchTo().alert(); String alertText =
		 * promptAlert.getText(); System.out.println("Alert text is " + alertText); //
		 * Send some text to the alert promptAlert.sendKeys("Test User");
		 * Thread.sleep(5000); File output =
		 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(output,"D:\\"); //Apache driver.close();
		 */
		
		/*
		 * WebElement element = driver.findElement(By.id("oldSelectMenu")); Select
		 * dropdown = new Select(element); dropdown.selectByIndex(0);
		 * dropdown.selectByValue("1"); WebElement mutliselect =
		 * driver.findElement(By.id("cars")); Select drop = new Select(mutliselect);
		 * boolean value = drop.isMultiple(); System.out.println(value);
		 * drop.selectByIndex(0); drop.selectByValue("saab");
		 * drop.selectByVisibleText("Saab"); WebElement Element2 =
		 * driver.findElement(By.xpath("(//*[@class=' css-1hwfws3'])[3]")); Select drop1
		 * = new Select(Element2); drop1.selectByIndex(0);
		 * drop1.selectByVisibleText("Black");
		 * 
		 * drop1.deselectByIndex(0); drop.deselectAll();
		 */
		driver.quit();
	}

}
