import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {
    WebDriver driver;

    @Before
    public void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        this.driver = driver;
    }

    @Given("User on Alert UI")
    public void userOnAlertUI() throws InterruptedException {
        Thread.sleep(10000);

        driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
        driver.findElement(By.xpath("//*[@id=\"alertexamples\"]")).click();
        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
