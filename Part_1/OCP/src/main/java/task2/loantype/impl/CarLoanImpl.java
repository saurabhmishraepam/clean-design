package task2.loantype;

import task2.Person;

public class CarLoanImpl extends Loan {

    @Override
    public int getLoan(Person person) {
        int loan = 2_000;
        if (person.getAge() > 50) {
            loan += 1_500;
        } else if (person.getAge() > 30) {
            loan += 1_000;
        }
        return multiply(loan, person.getIncome());
    }
}
