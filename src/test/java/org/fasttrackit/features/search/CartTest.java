package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addProductToCart(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.doSearch("necklace");
        productSteps.selectProductFromList("Silver Desert Necklace");
        cartSteps.clickAddToCart();
        cartSteps.verifySuccessMessage("Silver Desert Necklace");
    }
}
