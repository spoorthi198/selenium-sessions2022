import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class MonkeyTeasting {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        ArrayList<String>linkText = new ArrayList<String>();
        List<WebElement> footerlinks = driver.findElements(By.cssSelector(".navFooterVerticalRow ul li a"));
        int footer_count = footerlinks.size();
        for(int i=0;i<footer_count;i++){
            int random_index = (int) Math.floor(Math.random() * footer_count);
            WebElement e=footerlinks.get(random_index);
            System.out.println(e.getText());
            e.click();
            driver.navigate().back();
            Thread.sleep(1500);
             footerlinks = driver.findElements(By.cssSelector(".navFooterVerticalRow ul li a"));

        }

driver.close();
    }

}
