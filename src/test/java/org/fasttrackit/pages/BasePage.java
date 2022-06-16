package org.fasttrackit.pages;

import net.thucydides.core.pages.PageObject;

public class BasePage extends PageObject {


    public int getPriceFromString(String price) {
//   55,00 RON
        return Integer.parseInt(price
                .replace(" RON", "")
                .replace(",", ""));
    }
}
