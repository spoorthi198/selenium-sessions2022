import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDowmTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//div/a[contains(text(),'Create New Account')]")).click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]")).isDisplayed());
// Creation of webelements:

        WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));

        // using date format:

        String date = "20-Oct-1988";
      String datelist[] =  date.split("-");

      DropDownUtil.selectElementFromDropdown(day,datelist[0]);
        DropDownUtil.selectElementFromDropdown(month,datelist[1]);
        DropDownUtil.selectElementFromDropdown(year,datelist[2]);

        ArrayList<String> dayList= DropDownUtil.getDropDownValues(day);
        System.out.println(dayList);

        ArrayList<String> monthList=DropDownUtil.getDropDownValues(month);
        System.out.println(monthList);

        String dayLoc = "//Select[@id='day']/option";
        String monthLoc="//Select[@id='month']/option";
        String yearLoc = "//Select[@id='year']/option";
        DropDownUtil.selectValFromDropDownWitOutSelect(driver,dayLoc,"4");
        DropDownUtil.selectValFromDropDownWitOutSelect(driver,monthLoc,"Jan");

        DropDownUtil.selectValFromDropDownWitOutSelect(driver,yearLoc,"2000");

        driver.close();


    }
}
