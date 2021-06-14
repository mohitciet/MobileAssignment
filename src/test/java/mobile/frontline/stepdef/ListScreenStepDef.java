package mobile.frontline.stepdef;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import mobile.Frontline.utils.TestDataManager;
import mobile.frontline.pages.ListScreen;

import mobile.frontline.pages.NavigationScreen;
import org.junit.Assert;

import java.util.ArrayList;

public class ListScreenStepDef {

	public TestDataManager testdata = new TestDataManager();
	public NavigationScreen navigationMethods = new NavigationScreen();
	public ListScreen listMethods = new ListScreen();


	@When("User creates a list {string}")
	public void userCreatesList(String listName) throws Throwable {
		navigationMethods.selectLayout();
		navigationMethods.clickOnNavigationIcon();
		navigationMethods.createNewList();
		listMethods.enterListName(listName);
		listMethods.clickOkButton();
	}

	@When("User adds an item {string}")
	public void addListItem(String itemName) throws Throwable {
		listMethods.enterItemName(itemName);
		listMethods.clickAddButton();
	}

	@When("User deletes an item {string}")
	public void deleteListItem(String itemName) throws Throwable {
		listMethods.checkListItem();
		listMethods.clickCleanUpButton();
	}

	@Then("Verify items are sorted {string} {string} {string}")
	public void deleteListItem(String item1,String item2,String item3) throws Throwable {
		ArrayList<MobileElement> list= new ArrayList<MobileElement>();
		ArrayList<String> actualListNames= new ArrayList<>();
		ArrayList<String> expectedListNames= new ArrayList<>();
		expectedListNames.add(item1);
		expectedListNames.add(item2);
		expectedListNames.add(item3);
		list=listMethods.getItemsName();


		for (MobileElement elem : list) {
			System.out.println("Text :"+elem.getText());
			actualListNames.add(elem.getText());

		}
		Assert.assertEquals("List Names are not sorted",expectedListNames,actualListNames);
	}

}
