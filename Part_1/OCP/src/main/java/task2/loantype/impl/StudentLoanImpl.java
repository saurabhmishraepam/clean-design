package task2.loantype;

import task2.Person;

public class StudentLoanImpl extends Loan {
    @Override
    public int getLoan(Person person) {
        int loan = 100;

        if (person.getAge() >= 21) {
            loan += 150;
        }
        return multiply(loan, person.getIncome());
    }
}
