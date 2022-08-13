import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().fullscreen();
        //driver.get("https://selectorshub.com/xpath-practice-page/");
        WebElement userid = driver.findElement(By.id("userId"));
        userid.sendKeys("spoorthi");
        WebElement checkbox = driver.findElement(By.xpath("//a[text()='Garry.White']/parent::td/preceding-sibling::td/input"));
        checkbox.click();
        By row = By.xpath("//table[@id='resultTable']//tr");
        By col = By.xpath("//table[@id='resultTable']//tr//th");
        int rowCount = driver.findElements(row).size();
        int colCount = driver.findElements(col).size();
        System.out.println(rowCount);
        System.out.println(colCount);
        String beforeXpath = "//table[@id='resultTable']//tr[";
        String afterXpath = "]/td[";
        for(int i=1;i<=rowCount-1;i++){
            for(int j=2;j<=colCount;j++){
                String xpath = beforeXpath+i+afterXpath+j+"]";
                String text=driver.findElement(By.xpath(xpath)).getText();
                System.out.print(text + "|");


            }
            System.out.println();
        }
        driver.quit();
    }
}
