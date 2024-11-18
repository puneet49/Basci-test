package Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basic {
	public WebDriver hello;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\dml-puneet\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
		// driver initialization
		WebDriver driver = new ChromeDriver();
		// go to the webapp link
		driver.get("https://srv.dev.gg.cloudtechport.com/");

		// wait for the elements
		WebDriverWait wait = new WebDriverWait(driver, 20);

		// Click on the age confirmation pop up
		WebElement element2 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[contains(text(),\"Yes, I'm 21 or older\")]")));
		element2.click();
		System.out.println("CLICKED ");

		driver.manage().window().maximize();
		// Click on the sign in button
		driver.findElement(By.className("relative")).click();
		
		// enter the email
		List<WebElement> email = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By.xpath("//input[@name='email']"))));

		for (WebElement element : email) {
			wait.until(ExpectedConditions.elementToBeClickable(element)).click(); // Click the element
			element.sendKeys("qa@yopmail.com"); // Send input to the element
		}
		// enter the password
		List<WebElement> password = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By.xpath("//input[@name='password']"))));

		for (WebElement element : password) {
			wait.until(ExpectedConditions.elementToBeClickable(element)).click(); // Click the element
			element.sendKeys("Test@123"); // Send input to the element
		}
		// click on the login button
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		// printing the success alert
		System.out.println("Login Successfully");

		List<WebElement> brand = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(("(//button[text()='Brands'])[1]"))));
		for (WebElement create : brand) {
			wait.until(ExpectedConditions.elementToBeClickable(create)).click(); // Click the element
//create.click();
		}

		List<WebElement> addbrand = wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("(//button[text()='Add Brand'])[1]")));
		for (WebElement create1 : addbrand) {
			wait.until(ExpectedConditions.elementToBeClickable(create1)).click();
		}

		List<WebElement> addtitle = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@name='title']")));
		for (WebElement create1 : addtitle) {
			wait.until(ExpectedConditions.elementToBeClickable(create1)).sendKeys("macllan");
		}

		List<WebElement> addyear = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@name='yearEstablished']")));
		for (WebElement year : addyear) {
			wait.until(ExpectedConditions.elementToBeClickable(year)).sendKeys("2044");
		}

		List<WebElement> addcountry = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//select[@name='country']")));
		for (WebElement country : addcountry) {
			wait.until(ExpectedConditions.elementToBeClickable(country)).click();
		}

		List<WebElement> selectcountry = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//option[@value='India']")));
		for (WebElement country1 : selectcountry) {
			wait.until(ExpectedConditions.elementToBeClickable(country1)).click();
		}
		List<WebElement> enterregion = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@name='region']")));
		for (WebElement region : enterregion) {
			wait.until(ExpectedConditions.elementToBeClickable(region)).sendKeys("Albania");
		}

		List<WebElement> addtype = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//select[@name='type']")));
		for (WebElement type : addtype) {
			wait.until(ExpectedConditions.elementToBeClickable(type)).click();
		}
		List<WebElement> selecttype = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//option[@value='Single Malt']")));
		for (WebElement type1 : selecttype) {
			wait.until(ExpectedConditions.elementToBeClickable(type1)).click();
		}
		List<WebElement> BRANDSTORY = wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//textarea[@placeholder='Type here']")));
		for (WebElement type2 : BRANDSTORY) {
			wait.until(ExpectedConditions.elementToBeClickable(type2)).sendKeys("TESTING BRAND STORY");
		}
//Click on the proceed button
		List<WebElement> proceed = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[text()='Proceed']")));
		for (WebElement click : proceed) {
			wait.until(ExpectedConditions.elementToBeClickable(click)).click();
		}

//upload logo image

		List<WebElement> logo = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@id='logo']")));
		for (WebElement click : logo) {
			click.sendKeys("C:\\Users\\dml-puneet\\Downloads\\pexels-ketut-subiyanto-4246192.jpg");
		}

//upload cover image 

		List<WebElement> cover = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@id='cover']")));
		for (WebElement click : cover) {
			click.sendKeys("C:\\Users\\dml-puneet\\Downloads\\pexels-ketut-subiyanto-4246192.jpg");
		}
		System.out.println("title send");
//upload gallery image 
		List<WebElement> gallery = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@id='image0']")));
		for (WebElement click : gallery) {
			click.sendKeys("C:\\Users\\dml-puneet\\Downloads\\pexels-ketut-subiyanto-4246192.jpg");
		}

// click on proceed button
		List<WebElement> proceed1 = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[text()='Proceed']")));
		for (WebElement click : proceed1) {
			wait.until(ExpectedConditions.elementToBeClickable(click)).click();
		}

		// click on confirm button
		List<WebElement> confirm = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[text()='Confirm']")));
		for (WebElement click : confirm) {
			wait.until(ExpectedConditions.elementToBeClickable(click)).click();
		}

		// click on confirm button
		List<WebElement> popup = wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[text()='I'll do it later']")));
		for (WebElement click : popup) {
			wait.until(ExpectedConditions.elementToBeClickable(click)).click();
		}
//		driver.findElement(By.xpath("//button[text()='Confirm']")).click();I'll do it later

		// wait to see the window
		// Thread.sleep(10000);
		// close the webpage
//		driver.quit();
	}

}