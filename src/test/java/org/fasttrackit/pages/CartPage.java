package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CartPage extends PageObject {

    @FindBy(css = ".success-msg span")
    private WebElementFacade successMessage;

    public void verifySuccessMessage(String productName){
        successMessage.shouldContainOnlyText(productName + " was added to your shopping cart.");
    }
}
