package stepdesrun;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepdesfile {
	
	ChromeDriver driver;
	@Given("open the browser")
	public void open_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver selenium\\chromedriver.exe");
	     driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	}

	@Then("give {word}")
	public void give_lalitha(String uname) {
		driver.findElement(By.id("userName")).sendKeys(uname);
	}

	@Then("giving {word}")
	public void giving_password(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}

	@And("click login")
	public void click_login() {
	    driver.findElement(By.name("Login")).click();
	}

}
