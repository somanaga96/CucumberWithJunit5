import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
@CucumberOptions(features = "src/test/resources/features", glue = "src/main/java")
public class App {
}
