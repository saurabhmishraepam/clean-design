package task2;

import task2.loantype.*;
import task2.loantype.impl.CarLoanImpl;
import task2.loantype.impl.HouseLoanImpl;
import task2.loantype.impl.StudentLoanImpl;

public class LoanCalculator {

    private Loan studentLoan=new StudentLoanImpl();
    private Loan carLoan=new CarLoanImpl();
    private Loan houseLoan= new HouseLoanImpl();

    public int getLoan(Person person, LoanType type){
        switch(type){
            case CAR: {return carLoan.getLoan(person);}
            case STUDENT: {return studentLoan.getLoan(person);}
            case HOUSE: {return  houseLoan.getLoan(person);}
        }
        return -1;
    }
}
