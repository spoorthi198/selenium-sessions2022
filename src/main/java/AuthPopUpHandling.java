import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandling {
    public static void main(String[] args) {
        //generally Auth pop up cannot be able to inspect
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        // for Auth pop up un and password to be given in the url itself followed by @ domain name
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.close();
    }
}
