import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MyStepdefs {
    WebDriver driver;

    @Before
    public void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        this.driver = driver;
    }

    @Given("^user logins to cricbuzz$")
    public void userLoginsToCricbuzz() throws InterruptedException {
        driver.get("https://www.cricbuzz.com/");

//        Thread.sleep(5000);/**/
//        driver.quit();
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
