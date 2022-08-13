import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// for input and type is text we can use value attribute to capture the text entered
public class GetAttributeVal {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("test");
        System.out.println(driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).getAttribute("value"));
    }
}
