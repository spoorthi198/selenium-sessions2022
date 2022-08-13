import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDownUtil {


    /****
     * this method accepts the web element and use the text value to select the same from drop down
     * @param ele
     * @param val
     */

    public static void selectElementFromDropdown(WebElement ele, String val) {
        Select select = new Select(ele);
        //Thread.sleep(3000);
        select.selectByVisibleText(val);
    }

    /*****
     * this method accepts the web ele and use the index tp selct the same from drop down
     * @param ele
     * @param index
     */
    public static void selectByIndex(WebElement ele, int index) {

        Select sel = new Select(ele);
        sel.selectByIndex(index);
    }

    /****
     * get dropdown values and return them
     * @param ele
     * @return
     */
    public static ArrayList<String> getDropDownValues(WebElement ele){
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

    /***
     * select the drop down without using select class
     * @param driver
     * @param Locator
     * @param Val
     */

    public static void selectValFromDropDownWitOutSelect(WebDriver driver,String Locator, String Val) {
        List<WebElement> dropList =driver.findElements(By.xpath(Locator));
        System.out.println("size of droplist is:" + dropList.size());
        for(int i=0;i<dropList.size();i++){
            String text = dropList.get(i).getText();

            if(text.equals(Val)){
                dropList.get(i).click();
                break;
            }
        }



    }
    }

