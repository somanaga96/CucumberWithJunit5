package example;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Cricbuzz extends BaseTest{


    @Given("^user logins to cricbuzz$")
    public void userLoginsToCricbuzz() throws InterruptedException {
        driver.get("https://www.cricbuzz.com/");
    }


    @When("user select {string}")
    public void userSelect(String countryName) {
        WebElement teamDropDown = driver.findElement(By.id("teamDropDown"));
        Actions actions = new Actions(driver);
        actions.moveToElement(teamDropDown).perform();
        driver.findElement(By.xpath("//a[@title='" + countryName + " Cricket Team']")).click();
        driver.quit();
    }
}
