import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Pagination {
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://babynames.merschat.com/popular.cgi");
            WebElement page = driver.findElement(By.xpath("//select[@name='page']"));
            WebElement go = driver.findElement(By.cssSelector("input[value=Go]"));
            List<WebElement> namesList = driver.findElements(By.xpath("//a[contains(text(),'Talar')]"));
            int count =1;
            while(true) {

                if(!(namesList.size() == 1)) {
                    //next logic:
                    //driver.findElement(By.linkText("Next")).click();

                    //drop down logic
                    DropDownUtil.selectByIndex(page,count);
                    go.click();


                    namesList = driver.findElements(By.xpath("//a[contains(text(),'Talar')]"));
                    count++;
                }
                else {
                    String title = driver.findElement
                                    (By.xpath("(//a[contains(text(),'Talar')]/../parent::td//following-sibling::td)[2]//a"))
                            .getAttribute("title");
                    System.out.println(title);
                    break;
                }



            }

        }


}
