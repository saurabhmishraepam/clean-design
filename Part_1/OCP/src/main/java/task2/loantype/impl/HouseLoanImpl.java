package task2.loantype.impl;

import task2.Person;
import task2.loantype.Loan;

public class HouseLoanImpl extends Loan {
    private final int LOAN_INITIAL = 100_000;
    @Override
    public int getLoan(Person person) {
        int loan = LOAN_INITIAL;
        if (person.getAge() > 30 && person.getIncome() > loan / 2) {
            loan *= 2;
        }
        return multiply(loan, person.getIncome());
    }
}
