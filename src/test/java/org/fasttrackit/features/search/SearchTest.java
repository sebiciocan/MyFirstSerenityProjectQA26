package org.fasttrackit.features.search;

import org.junit.Test;

public class SearchTest extends BaseTest{


    @Test
    public void searchProductTest(){
        loginSteps.doLogin("cosmin@fasttrackit.org","123456");
        searchSteps.doSearch("necklace");
        searchSteps.verifyProductInResults("Silver Desert Ne");
    }
}
