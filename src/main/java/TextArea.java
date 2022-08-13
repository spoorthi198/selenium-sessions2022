import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextArea {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("googlegooglegooglegooglegoogle"
        +"googooglegooglegooglegooglegooglegle"
        +"googgooglegooglegooglegooglee"
        +"flagooglegooglegooglegooglegooglegs");
    }
}
