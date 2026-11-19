import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Steps {

    WebDriver driver;

    @Given("I am on the home page of the website")
    public void i_am_on_the_home_page_of_the_website() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        Thread.sleep(5000);

    }
    @And("I click login button")
    public void i_click_login_button() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Login']"))).click();
    }
    @And("I enter username (.*)$")
    public void i_enter_username(String username) {
        driver.findElement(By.id("login-email")).sendKeys(username);
    }
    @And("I enter password (.*)$")
    public void i_enter_password(String password) {
        driver.findElement(By.id("login-password")).sendKeys(password);
    }
    @When("I click submit button")
    public void i_click_submit_button() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(3000);

    }
    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        driver.findElement(By.xpath("//span[text()='Welcome']")).isDisplayed();

    }

}
