package com.actions;

import com.pages.tnxPage;

public class txnActions extends tnxPage {

    public String getText(String text){
        return findElement(txnHeadingLoc).getText();
    }


}
