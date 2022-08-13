import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
        WebElement sourceEle = driver.findElement(By.id("draggable"));
        WebElement targetEle = driver.findElement(By.id("droppable"));

        // Action class require to pass driver

        Actions action = new Actions(driver);
        //method1:
        action.
        clickAndHold(sourceEle).
        moveToElement(targetEle).
        release().
        build().
        perform();

        //method2:
        action.dragAndDrop(sourceEle,targetEle).build().perform();

    }
}
