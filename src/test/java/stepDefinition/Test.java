package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test {
	
	public static WebDriver driver;
	
	@Given("^user is on sample login page$")
	public void user_is_on_sample_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Files\\chromedriver.exe");
    	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/hp/Downloads/QE-index.html");
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL,"file:///C:/Users/hp/Downloads/QE-index.html");
	}

	@When("^email, password and login button is present$")
	public void email_password_and_login_button_is_present()
	{
		WebElement email = driver.findElement(By.id("inputEmail"));
		Assert.assertEquals(true, email.isEnabled());
		System.out.println("Element is enabled – Assert passed");
		
		WebElement password = driver.findElement(By.id("inputPassword"));
		Assert.assertEquals(true, password.isEnabled());
		System.out.println("Element is enabled – Assert passed");
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) 
	{
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
            driver.findElement(By.id("inputEmail")).sendKeys(data.get("username"));
			driver.findElement(By.id("inputPassword")).sendKeys(data.get("password"));
		}

	}

	@Then("^user clicks on signin button$")
	public void user_clicks_on_signin_button() 
	{
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.close();
	}


	@Given("^user is on sample login page now$")
	public void user_is_on_sample_login_page_now()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/hp/Downloads/QE-index.html");
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL,"file:///C:/Users/hp/Downloads/QE-index.html");
	}

	@Then("^user checks there are three values in the listgroup$")
	public void user_checks_there_are_three_values_in_the_listgroup()
	{
		List<WebElement> list = driver.findElements(By.xpath("//div[2]/div/ul/li"));
		int length = list.size();
		System.out.println(length);
		Assert.assertEquals(3, length);
	}

	@Then("^user checks second list item's value$")
	public void user_checks_second_list_item_s_value()
	{
	  WebElement list2 = driver.findElement(By.xpath("//div[2]/div/ul/li[2]"));
	  String actual_itemvalue = list2.getText();
	  System.out.println(actual_itemvalue);
	  String expected_itemvalue = "List Item 2";
	  Assert.assertTrue(actual_itemvalue.contains(expected_itemvalue));
	}

	@Then("^user checks second item's badge value$")
	public void user_checks_second_item_s_badge_value() 
	{
		WebElement badge2 = driver.findElement(By.xpath("//div[2]/div/ul/li[2]"));
		String actual_badgevalue = badge2.getText();
		System.out.println(actual_badgevalue);
		String expected_badgevalue = "6";
		Assert.assertTrue(actual_badgevalue.contains(expected_badgevalue));
		driver.close();
	}
	
	@Given("^user is on the sample login page$")
	public void user_is_on_the_sample_login_page() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/hp/Downloads/QE-index.html");
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL,"file:///C:/Users/hp/Downloads/QE-index.html");
	}

	@Then("^user checks default selected value$")
	public void user_checks_default_selected_value()
	{
		WebElement default_button = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
        String text = default_button.getText();
        System.out.println(text);
        String expected_default = "Option 1";
        Assert.assertTrue(text.contains(expected_default));
	}

	@Then("^user selects from the list$")
	public void user_selects_from_the_list() 
	{
	   driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
	   driver.findElement(By.xpath("//a[text()='Option 3']")).click();
	   WebElement default_button = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
       String text = default_button.getText();
       System.out.println(text);
       String expected_default = "Option 3";
       Assert.assertTrue(text.contains(expected_default));
       driver.close();
	}
	
	@Given("^user is on login page$")
	public void user_is_on_login_page()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/hp/Downloads/QE-index.html");
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL,"file:///C:/Users/hp/Downloads/QE-index.html");
	}

	@Then("^user checks if button is enabled$")
	public void user_checks_if_button_is_enabled()
	{
		WebElement button2 = driver.findElement(By.xpath("(//button[@type='button'and@class='btn btn-lg btn-primary'])[1]"));
		Assert.assertEquals(true, button2.isEnabled());
		System.out.println("Element is enabled – Assert passed");
	}

	@Then("^user checks in button is disabled$")
	public void user_checks_in_button_is_disabled()
	{
		WebElement button3 = driver.findElement(By.xpath("//button[@type='button'and@class='btn btn-lg btn-secondary']"));
		Assert.assertEquals(false, button3.isEnabled());
		System.out.println("Element is Disbaled – Assert passed");
		driver.close();
	}
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/hp/Downloads/QE-index.html");
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL,"file:///C:/Users/hp/Downloads/QE-index.html");
	}

	@Then("^user waits for the button to be displayed and clicks on it$")
	public void user_waits_for_the_button_to_be_displayed_and_clicks_on_it() 
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='test5-button']"))).click();
	}

	@Then("^user checks if the message is displayed$")
	public void user_checks_if_the_message_is_displayed() 
	{
		WebElement button4 = driver.findElement(By.xpath("//div[@id='test5-alert']"));
		String text = button4.getText();
	    System.out.println(text);
	    String expected_default = "You clicked a button!";
	    Assert.assertTrue(text.contains(expected_default));
	}

	@Then("^user checks if the button is now displayed$")
	public void user_checks_if_the_button_is_now_displayed() 
	{
		WebElement button3 = driver.findElement(By.xpath("//button[@type='button'and@id='test5-button']"));
		Assert.assertEquals(false, button3.isEnabled());
		System.out.println("Element is Disbaled – Assert passed");
		driver.close();
	}

	@Given("^user is on the login page now$")
	public void user_is_on_the_login_page_now()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/hp/Downloads/QE-index.html");
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL,"file:///C:/Users/hp/Downloads/QE-index.html");
	}

	@Then("^user finds the value of any cell on the grid$")
	public void user_finds_the_value_of_any_cell_on_the_grid()
	{
	   String cell_value = driver.findElement(By.xpath("//table//tr[2]/td[1]")).getText();
	   System.out.println(cell_value);
	   String expected_value = "Griff";
	   Assert.assertTrue(cell_value.contains(expected_value));
	}

	@Then("^user finds cell at coordinates$")
	public void user_finds_cell_at_coordinates() 
	{
		String coordinate_value = driver.findElement(By.xpath("//table//tr[3]/td[3]")).getText();
		System.out.println(coordinate_value);
	}

	@Then("^user check the value of the cell$")
	public void user_check_the_value_of_the_cell() 
	{
		String coordinate_actualvalue = driver.findElement(By.xpath("//table//tr[3]/td[3]")).getText();
		System.out.println(coordinate_actualvalue);
		String expected_coordinatevalue = "Ventosanzap";
		Assert.assertTrue(coordinate_actualvalue.contains(expected_coordinatevalue));
		driver.close();
	}
}
