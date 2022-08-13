import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindTotalLinks {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.in");
        List<WebElement> list = driver.findElements(By.tagName("a"));
        for(int i=0;i<list.size();i++){
            String listText = list.get(i).getText();
            if(listText.isEmpty()){
                //System.out.println("hidden link");
                //break;
                continue;
            }else{
                System.out.println(listText);
            }
        }
    }
}
