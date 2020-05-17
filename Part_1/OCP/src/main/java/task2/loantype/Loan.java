package task2.loantype;

import task2.Person;

public abstract class  Loan {
     abstract public int getLoan(Person person);

     public int multiply(int loan, int income) {
          return loan * getIncomeMultiplier(income);
     }
     private int getIncomeMultiplier(int income) {
          return income <= 1_000 ? 1 : 2;
     }
}
