import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ShadowDom {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://selectorshub.com/xpath-practice-page/");
        //driver.switchTo().frame("pact1");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement ele = (WebElement) jse.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
       String js = "arguments[0].setAttribute('value','triangle')";
       jse.executeScript(js,ele);

    }
}
