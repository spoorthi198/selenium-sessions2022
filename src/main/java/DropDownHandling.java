import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DropDownHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//div/a[contains(text(),'Create New Account')]")).click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]")).isDisplayed());






        WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));
        getDropDownValues(day);
        getDropDownValues(month);
        getDropDownValues(year);

//        selectElementFromDropdown(day,"4");
//        selectByIndex(month,8);
//        selectByIndex(year,1);
//        selectElementFromDropdown(month,"Mar");
//        selectElementFromDropdown(year,"1988");
            driver.close();
    }

    /****
     * this method accepts the web element and use the text value to select the same from drop down
     * @param ele
     * @param val
     */

    public static void selectElementFromDropdown(WebElement ele, String val)  {
        Select select = new Select(ele);
        //Thread.sleep(3000);
        select.selectByVisibleText(val);
    }

    /*****
     * this method accepts the web ele and use the index tp selct the same from drop down
     * @param ele
     * @param index
     */
    public static  void selectByIndex(WebElement ele,int index){

        Select sel = new Select(ele);
        sel.selectByIndex(index);
    }

    /****
     * using select.getoptions()
     * @param ele
     */


    public static ArrayList<String>  getDropDownValues(WebElement ele){
        Select sel = new Select(ele);
        List<WebElement> dropList =sel.getOptions();
        System.out.println("total no of val in dropdown:"  + dropList.size());
        ArrayList<String> ar = new ArrayList<String>();
        for(int i=0; i<dropList.size();i++){
            String text = dropList.get(i).getText();
            ar.add(text);
            //System.out.println(day);
        }
        return ar;
    }
}
