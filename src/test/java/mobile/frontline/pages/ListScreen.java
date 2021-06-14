package mobile.frontline.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import mobile.Frontline.utils.GlobalParams;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class ListScreen extends BasePage {


    @AndroidFindBy(xpath = "//android.widget.EditText[@text='e.g. wishlist, family list']")
    public MobileElement listNameTextBox;

    @AndroidFindBy(id= "android:id/button1")
    public MobileElement okButton;

    @AndroidFindBy(id= "org.openintents.shopping:id/autocomplete_add_item")
    public MobileElement listItemTextBox;

    @AndroidFindBy(id= "org.openintents.shopping:id/button_add_item")
    public MobileElement addButton;

    @AndroidFindBy(id= "org.openintents.shopping:id/check")
    public MobileElement itemCheckBox;

    @AndroidFindBy(xpath = "//*[@content-desc='Clean up list']")
    public MobileElement cleanUpButton;



    public ListScreen() {
    }

    public void enterListName(String listName) {
        enterValueInTextField(listNameTextBox,listName , "Entering new list name");
    }

    public void clickOkButton() {
        click(okButton, "Clicking on ok Button");
    }

    public void enterItemName(String listItemName) {
        enterValueInTextField(listItemTextBox,listItemName , "Entering new list name");
    }

    public void clickAddButton() {
        click(addButton, "Clicking on add Button");
    }

    public void checkListItem() {
        click(itemCheckBox, "Clicking on item checkbox");
    }

    public void clickCleanUpButton() {
        click(cleanUpButton, "Clicking on clean up button");
    }


    public ArrayList<MobileElement> getItemsName() {
        List<MobileElement> districts = driver.findElementsById("org.openintents.shopping:id/name");
        return (ArrayList<MobileElement>) districts;
    }

}