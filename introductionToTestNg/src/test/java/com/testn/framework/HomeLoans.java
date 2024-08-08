package com.testn.framework;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeLoans {

    @Test
    public void HomeLoansLogin(){
        //System.out.println("This will run before the whole test suite");
        System.out.println("You have login in successfully");
    }

    @Test
    public void HomeLoanApproved(){
        //System.out.println("This methods runs after any other method");
        System.out.println("Your loan has been approved. ");
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
