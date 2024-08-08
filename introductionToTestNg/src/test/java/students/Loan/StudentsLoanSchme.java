package students.Loan;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StudentsLoanSchme {
    @Parameters({"department"})
    @Test
    public void StudentLoanApplication(String dept){
        System.out.println("Your application has begun: " + dept + " " + "department");
    }
    @Parameters({"first_name"})
    @Test
    public void StudentLoanApproved(String name){
        System.out.println("congratulations, loan has been approved: " + name);
    }
}
