package com;

import com.actions.txnActions;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TransactionTest {

    static txnActions actions;
     //static url = " https://blockstream.info/block/000000000000000000076c036ff5119e5a5a74df77abf64203473364509f7732 ";

    @BeforeClass
    public static void setup(){
        actions = new txnActions();
        actions.init();
    }

    @AfterClass
    public static void tearDown(){
        actions.quitDriver();
    }

    @Test
    public void validateHeading() throws JsonProcessingException {
        actions.loadPage("https://blockstream.info/block/000000000000000000076c036ff5119e5a5a74df77abf64203473364509f7732");
        String headingText = actions.getText("25 of 2875 Transactions");
        Assert.assertEquals("25 of 2875 Transactions", headingText);
    }

    @Test
    public void displayHash() throws JsonProcessingException {

    }

}
