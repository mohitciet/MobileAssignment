package mobile.frontline.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import mobile.Frontline.utils.GlobalParams;

public class NavigationScreen extends BasePage {

    @AndroidFindBy(id= "layout_choice_bottom")
    public MobileElement layOutTypeRadioButton;

    @AndroidFindBy(xpath = "//*[@content-desc='Open navigation drawer']")
    public MobileElement navigationIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='New list']")
   // @AndroidFindBy(id= "org.openintents.shopping:id/text1")
    public MobileElement newListButton;



    public NavigationScreen() {
    }

    public void selectLayout() {
        click(layOutTypeRadioButton, "Clicking on layout choice actionbar");
    }

    public void clickOnNavigationIcon() {
        click(navigationIcon, "Clicking on Navigation Icon");
    }
    public void createNewList() {
        click(newListButton, "Clicking on New List Button");
    }


}