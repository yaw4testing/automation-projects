package com.testn.framework;

import dataProviders.NewDataProviders;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class HomeLoans {

    @Test(dataProvider = "test1", dataProviderClass = NewDataProviders.class)
    public void HomeLoansLogin(String name, Integer age){
        //System.out.println("This will run before the whole test suite");
        System.out.println("You have login in successfully " + name +" and age is: " + age);
    }

    @Test(dataProvider = "test2", dataProviderClass = NewDataProviders.class)
    public void HomeLoanApproved(String names, Integer numbers){
        //System.out.println("This methods runs after any other method");
        System.out.println("Your loan has been approved. " + names + " " + numbers );
    }
    @Test
    public void HomeLoanWaiting(){
        System.out.println("Your loan approval is being considered");
    }
    @Test
    public void HomeLoanDeclined(){
        System.out.println("we are sorry we couldn't proceed with your loan application");
    }
}
