import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class HashMapConcept {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=41&search=imac");
        By listElements = By.xpath("(//div[@id='content']//div[@class='col-sm-4']//ul)[1]");
        By elements = By.cssSelector("#content .list-unstyled:nth-of-type(1) li");
//        List<String> listele = getproductInfo(driver, listElements);
//        System.out.println(listele);
        Map<String, String> ele = getProductInformationByMap(driver,elements);
        System.out.println(ele);

    }

    public static List<String> getproductInfo(WebDriver driver,By locator){
        List<WebElement> meta = driver.findElements(locator);
        //
        List<String> testList = new ArrayList<String>();
        for (WebElement e:meta) {
          String text = e.getText();
          testList.add(text);
        }
        return testList;
    }

    public static Map<String,String> getProductInformationByMap(WebDriver driver,By locator){
        Map<String,String> productinfo = new HashMap<>();
        WebElement name = driver.findElement(By.xpath("//h1[text()='iMac']"));
        productinfo.put("Name",name.getText().trim());
        List<WebElement> meta1 = driver.findElements(locator);
        for (WebElement e: meta1) {
            productinfo.put(e.getText().split(":")[0], e.getText().split(":")[1]);

        }


        return productinfo;
    }
}
