package NEWS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NEWSCREATE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dml-puneet\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64");
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
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		// enter the email
		List<WebElement> email = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By.xpath("//input[@placeholder='Email']"))));

		for (WebElement element : email) {
			wait.until(ExpectedConditions.elementToBeClickable(element)).click(); // Click the element
			element.sendKeys("b2c@yopmail.com"); // Send input to the element
			System.out.println("In for loop ");
		}
		// enter the password
		List<WebElement> password = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By.xpath("//input[@name='password']"))));

		for (WebElement element1 : password) {
			wait.until(ExpectedConditions.elementToBeClickable(element1)).click(); // Click the element
			element1.sendKeys("Test@123"); // Send input to the element
		}
		// click on the login button
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		// printing the success alert

		System.out.println("Login Successfully");

		List<WebElement> news = wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(("(//button[text()='News & Events'])[1]"))));
		for (WebElement create : news) {
			wait.until(ExpectedConditions.elementToBeClickable(create)).click(); // Click the element
			// create.click();
		}
		// Click on add announcement button
		List<WebElement> Announcement = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(("//a[text()='Add Announcement']"))));
		for (WebElement create : Announcement) {
			wait.until(ExpectedConditions.elementToBeClickable(create)).click(); // Click the element
			// create.click();
		}

		List<WebElement> title = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By.xpath("//input[@name='title']"))));
		for (WebElement create : title) {
			wait.until(ExpectedConditions.elementToBeClickable(create)).click(); // Click the element
			create.sendKeys("Title");
		}
		List<WebElement> location = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By.xpath("//select[@name='geoLocation']"))));
		for (WebElement create : location) {
			wait.until(ExpectedConditions.elementToBeClickable(create)).click(); // Click the element
			create.sendKeys("london");
		}
		List<WebElement> date = wait.until(ExpectedConditions
				.presenceOfAllElementsLocatedBy((By.xpath("//input[@placeholder='Select date of event']"))));
		for (WebElement create : date) {
			wait.until(ExpectedConditions.elementToBeClickable(create)).click(); // Click the element
			create.sendKeys("1255787");
		}
//		List<WebElement> duration = wait
//				.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By.xpath("//input[@name='duration']"))));
//		for (WebElement create : duration) {
//			wait.until(ExpectedConditions.elementToBeClickable(create)).click(); // Click the element
//			create.sendKeys("1255787");
//		}
		List<WebElement> desc = wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy((By.xpath("//textarea[@name='description']"))));
		for (WebElement create : desc) {
			wait.until(ExpectedConditions.elementToBeClickable(create)).click(); // Click the element
			create.sendKeys(
					"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,");
		}

		List<WebElement> upload = wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy((By.xpath("//div[span='Publication Cover Image']"))));
		for (WebElement create : upload) {
			wait.until(ExpectedConditions.elementToBeClickable(create)).click(); // Click the element
			create.sendKeys("C:\\Users\\dml-puneet\\Downloads\\q.jpg");
		}

	}
}
