package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;
    @FindBy(css = "[title='Log In']")
    private WebElementFacade loginLink;
    @FindBy(id = "search")
    private WebElementFacade searchField;
    @FindBy(css = "[title='Search']")
    private WebElementFacade searchIcon;
    @FindBy(id = "select-language")
    private WebElementFacade languageDropdown;


    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public void setSearchField(String keyword) {
        typeInto(searchField, keyword);
    }

    public void clickSearchIcon() {
        waitFor(searchField);
        clickOn(searchIcon);
    }

    public void selectLanguage(){
        selectFromDropdown(languageDropdown, "English");
        withAction().moveToElement(languageDropdown).build();
        getAlert().dismiss();
        languageDropdown.shouldContainText(""+"product"+" has been added to your cart.");
    }

    public static void workingWithStrings(){
        String x = "ceva, altceva";
        String y = x.replace(".00 RON","");
        String[] z = x.split(",");

    }
}
