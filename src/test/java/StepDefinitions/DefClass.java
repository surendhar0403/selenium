package StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class DefClass {
	public static WebDriver driver;

	@Given("user goes to login page")
	public void user_goes_to_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com");

	}

	@When("user {string} and {string}")
	public void detais(String string, String string2) {
		WebElement textuser = driver.findElement(By.name("username"));
		textuser.sendKeys(string);

		WebElement textpass = driver.findElement(By.name("password"));
		textpass.sendKeys(string2);

	}

	@When("Clicks login button")
	public void clicks() {
		WebElement log = driver.findElement(By.name("login"));
		log.click();

	}

	@When("select the loction")
	public void selecttheloction() {
		WebElement locat = driver.findElement(By.name("location"));
		Select s = new Select(locat);
		s.selectByValue("London");

	}

	@When("select the Hotel")
	public void selecthotel() {
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Sunshine");

	}

	@When("select the type of Rooms")
	public void typeofrooms() {
		WebElement type = driver.findElement(By.name("room_type"));
		Select s2 = new Select(type);
		s2.selectByValue("Super Deluxe");

	}

	@When("to select no of Rooms")
	public void noOfrooms() {
		WebElement numbers = driver.findElement(By.name("room_nos"));
		Select s3 = new Select(numbers);
		s3.selectByIndex(3);

	}

	@When("to select in Date")
	public void selectIndate() {

	}

	@When("to selcet out Date")
	public void selcetOutdate() {

	}

	@When("no of adults Rooms")
	public void noofadultsrooms() {
		WebElement adults = driver.findElement(By.name("adult_room"));
		Select s6 = new Select(adults);
		s6.selectByValue("3");

	}

	@When("no of childrens Rooms")
	public void noofchildrensrooms() {
		WebElement child = driver.findElement(By.name("child_room"));
		Select s7 = new Select(child);
		s7.selectByValue("2");

	}

	@When("from serching hotels")
	public void serchinghotels() {
		WebElement log1 = driver.findElement(By.name("Submit"));
		log1.click();

	}

	@When("to click the RadioButton")
	public void radiobutton() {
		WebElement btn = driver.findElement(By.name("radiobutton_0"));
		btn.click();

	}

	@When("to continue")
	public void continue1() {
		WebElement con = driver.findElement(By.name("continue"));
		con.click();

	}

	@When("first name")
	public void first_name() {
		WebElement fn = driver.findElement(By.name("first_name"));
		fn.sendKeys("surey");

	}

	@When("lastname")
	public void lastname() {
		WebElement ln = driver.findElement(By.name("last_name"));
		ln.sendKeys("suresh");

	}

	@When("Billing address")
	public void billing_address() {
		WebElement add = driver.findElement(By.name("address"));
		add.sendKeys("no 20 chennai- 60005");

	}

	@When("card no")
	public void card_no() {
		WebElement cno = driver.findElement(By.name("cc_num"));
		cno.sendKeys("1234567890120987");

	}

	@When("card type")
	public void card_type() {
	
		WebElement cct = driver.findElement(By.name("cc_type"));
		Select a = new Select(cct);
		a.selectByValue("VISA");

	}

	@When("expairy Date")
	public void expairy_date() {
		WebElement cem = driver.findElement(By.name("cc_exp_month"));
		Select b = new Select(cem);
		b.selectByValue("4");

		WebElement cey = driver.findElement(By.name("cc_exp_year"));
		Select a2 = new Select(cey);
		a2.selectByValue("2022");

	}

	@When("cvv no")
	public void cvv_no() {
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("287");

	}

	@When("booking")
	public void booking() {
		WebElement book = driver.findElement(By.name("book_now"));
		book.click();

	}

	@When("my itinerary")
	public void my_itinerary() {
		WebElement cli = driver.findElement(By.xpath("//input[@class= 'reg_button' ][2]"));
		cli.click();
	}

	@Then("user goes to home page")
	public void homepage() {

	}

}
