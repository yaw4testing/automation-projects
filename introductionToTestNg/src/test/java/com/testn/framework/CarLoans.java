package com.testn.framework;

import org.testng.SuiteRunner;
import org.testng.annotations.*;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class CarLoans
{
    @Test
    public void CarLoansLogin(){

        System.out.println("you are logged in");
    }

    @Test
    public void CarLoanApproved(){
        //System.out.println("This will run last after the whole test");
        System.out.println("Your car loan has been approved");
    }
    @Parameters({"first_name", "last_name"})
    @Test
    public void CarLoanDeclined(String firstName, String lastName){

        System.out.println("We are sorry we couldn't offer you a loan: " + firstName + " " + lastName);
    }
}
