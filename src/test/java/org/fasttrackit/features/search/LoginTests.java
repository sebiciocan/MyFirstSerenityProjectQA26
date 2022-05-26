package org.fasttrackit.features.search;

import org.junit.Test;


public class LoginTests extends BaseTest{


    @Test
    public void loginWithValidCredentialsTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials("cosmin@fasttrackit.org","123456");
        loginSteps.clickLogin();
        loginSteps.verifyUsernameMessage("Cosmin Fast");
    }
}
