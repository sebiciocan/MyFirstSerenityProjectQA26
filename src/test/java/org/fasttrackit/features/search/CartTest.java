package org.fasttrackit.features.search;

import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addProductToCart(){
        loginSteps.doLogin("cosmin@fasttrackit.org","123456");
        searchSteps.doSearch("necklace");
        productSteps.selectProductFromList("Silver Desert Necklace");
        cartSteps.clickAddToCart();
        cartSteps.verifySuccessMessage("Silver Desert Necklace");
    }
}
