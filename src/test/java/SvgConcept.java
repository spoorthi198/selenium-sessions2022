import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class SvgConcept {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://petdiseasealerts.org/forecast-map/#/");
        Thread.sleep(5000);
        List<WebElement> svgXpath = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']/*[name()='g']/*[name()='path' ]"));
        Actions act = new Actions(driver);
        for (WebElement e:svgXpath) {
            act.moveToElement(e).perform();
            String statename= e.getAttribute("name");
            System.out.println(statename);
            if(statename.equalsIgnoreCase("georgia")){
                e.click();
                break;
            }

        }
    }
}
