import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class ContextMenuHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement rightClickButton = driver.findElement(By.xpath("//span[contains(@class,'context-menu-one')]"));
        Actions action = new Actions(driver);
        action.contextClick(rightClickButton).build().perform();
        // displaying single element:

        String text = driver.findElement(By.xpath("//ul/li[contains(@class,'context-menu-icon-copy')]/span")).getText();
        System.out.println(text);

       // displaying list of elements:
        String list="//ul[contains(@class,'context-menu-root')]/li/span";
        ArrayList<String> read = getTextOfRightClickEle(driver,list);
        System.out.println(read);
        driver.close();


    }
// Assignment to print list of right click options:
    public static ArrayList<String> getTextOfRightClickEle(WebDriver driver,String loc){
        List<WebElement> rightClickOptions = driver.findElements(By.xpath(loc));
        ArrayList<String> ar = new ArrayList<>();
        for(int i=0;i<rightClickOptions.size();i++){
            String text = rightClickOptions.get(i).getText();
            ar.add(text);

        }
        return ar;
    }
}
