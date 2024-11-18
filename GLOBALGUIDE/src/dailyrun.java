import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dailyrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dml-puneet\\Downloads\\chromedriver.exe");
		// driver initialization
		WebDriver driver = new ChromeDriver();
		// go to the webapp link
		driver.get("https://srv.dev.gg.cloudtechport.com/");
		// maximize window
		driver.manage().window().maximize();

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
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();

			// Click the element
			element.sendKeys("b2c@yopmail.com");

			// Send input to the element
			System.out.println("In for loop ");

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

			// click on the brands menu option
			List<WebElement> duration = wait
					.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By.xpath("//button[text()='Brands']"))));
			for (WebElement create : duration) {
				wait.until(ExpectedConditions.elementToBeClickable(create)).click();
				System.out.println("Brands Page Opened Successfully");

				// click on the distilleries menu option
				List<WebElement> duration1 = wait.until(ExpectedConditions
						.presenceOfAllElementsLocatedBy((By.xpath("//button[text()='Distilleries']"))));
				for (WebElement create1 : duration1) {
					wait.until(ExpectedConditions.elementToBeClickable(create1)).click();
					System.out.println("Distilleries Page Opened Successfully");

					// click on the company menu option
					List<WebElement> duration2 = wait.until(ExpectedConditions
							.presenceOfAllElementsLocatedBy((By.xpath("//button[text()='Company']"))));
					for (WebElement create2 : duration2) {
						wait.until(ExpectedConditions.elementToBeClickable(create2)).click();
						System.out.println("Company Page Opened Successfully");

						// click on the Releases menu option

						List<WebElement> duration3 = wait.until(ExpectedConditions
								.presenceOfAllElementsLocatedBy((By.xpath("//button[text()='Releases']"))));
						for (WebElement create3 : duration3) {
							wait.until(ExpectedConditions.elementToBeClickable(create3)).click();
							System.out.println("Releases Page Opened Successfully");

							// click on the News & Events menu option

							List<WebElement> duration4 = wait.until(ExpectedConditions
									.presenceOfAllElementsLocatedBy((By.xpath("//button[text()='News & Events']"))));
							for (WebElement create4 : duration4) {
								wait.until(ExpectedConditions.elementToBeClickable(create4)).click();
								System.out.println("News & Events Page Opened Successfully");
								
								// click on the Merchants menu option

								List<WebElement> duration5 = wait.until(ExpectedConditions
										.presenceOfAllElementsLocatedBy((By.xpath("//button[text()='Merchants'][1]"))));
								for (WebElement create5 : duration5) {
									wait.until(ExpectedConditions.elementToBeClickable(create5)).click();
									System.out.println("Merchants Opened Successfully");
									
									driver.close();
									System.out.println("Browser Closed,GoodBye");


								}
							}
						}

					}
				}
			}
		}
	}
}