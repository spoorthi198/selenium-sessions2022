import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.londonfreelance.org/courses/frames/index.html");
        driver.switchTo().frame("main");
        String text = driver.findElement(By.xpath("//h2[contains(text(),'Title bar')]")).getText();
        System.out.println(text);
        // to switch back the driver to page swithTo().defaultContent();
        driver.switchTo().defaultContent();
        //or selenium 4 feature:
        driver.switchTo().parentFrame();
    }

}
