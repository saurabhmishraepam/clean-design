package task2.loantype;

import task2.Person;

public class HouseLoanImpl extends Loan {
    @Override
    public int getLoan(Person person) {
        int loan = 100_000;

        if (person.getAge() > 30 && person.getIncome() > loan / 2) {
            loan *= 2;
        }
        return multiply(loan, person.getIncome());
    }
}
