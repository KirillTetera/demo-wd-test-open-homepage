import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenOnlinerTest {
    @Test
    public void openOnlinerTestMainPage(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.youtube.com/");
    }
}
