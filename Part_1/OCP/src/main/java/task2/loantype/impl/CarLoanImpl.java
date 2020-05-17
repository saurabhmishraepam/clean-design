package task2.loantype.impl;

import task2.Person;
import task2.loantype.Loan;

public class CarLoanImpl extends Loan {
    private final int LOAN_INITIAL = 2_000;
    @Override
    public int getLoan(Person person) {
        int loan = LOAN_INITIAL;
        if (person.getAge() > 50) {
            loan += 1_500;
        } else if (person.getAge() > 30) {
            loan += 1_000;
        }
        return multiply(loan, person.getIncome());
    }
}
