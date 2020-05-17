package task2.loantype.impl;

import task2.Person;
import task2.loantype.Loan;

public class StudentLoanImpl extends Loan {
    private final int LOAN_INITIAL = 100;
    @Override
    public int getLoan(Person person) {
        int loan = LOAN_INITIAL;
        if (person.getAge() >= 21) {
            loan += 150;
        }
        return multiply(loan, person.getIncome());
    }
}
