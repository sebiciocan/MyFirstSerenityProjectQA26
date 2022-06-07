package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;


public class LoginTests extends BaseTest{


    @Test
    public void loginWithValidCredentialsTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials(Constants.USER_EMAIL,Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyUsernameMessage("Cosmin Fast");
    }
}
