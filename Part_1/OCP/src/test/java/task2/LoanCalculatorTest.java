package task2;

import org.junit.Test;
import task2.loantype.LoanType;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LoanCalculatorTest {

    private LoanCalculator calculator = new LoanCalculator();

    @Test
    public void studentLoanForYoungPoorPerson() {
        assertThat(calculator.getLoan(new Person(18, 100),
                LoanType.STUDENT),
                is(100));
    }

   @Test
    public void studentLoanForOldPerson() {

       assertThat(calculator.getLoan(new Person(21, 100),
               LoanType.STUDENT),
               is(250));
    }

    @Test
    public void studentLoanForRichPerson() {
        assertThat(calculator.getLoan(new Person(18, 2_000),
                LoanType.STUDENT),
                is(200));
    }

    @Test
    public void carLoanForYoungPoorPerson() {
        assertThat(calculator.getLoan(new Person(20, 500),
                LoanType.CAR),
                is(2_000));
    }

    @Test
    public void carLoanForAdultPoorPerson() {
        assertThat(calculator.getLoan(new Person(45, 500),
                LoanType.CAR),
                is(3_000));
    }

    @Test
    public void carLoanForOldPoorPerson() {
        assertThat(calculator.getLoan(new Person(60, 500),
                LoanType.CAR),
                is(3_500));
    }

    @Test
    public void carLoanForYoungRichPerson() {
        assertThat(calculator.getLoan(new Person(20, 2_000),
                LoanType.CAR),
                is(4_000));
    }

    @Test
    public void carLoanForAdultRichPerson() {
        assertThat(calculator.getLoan(new Person(45, 2_000),
                LoanType.CAR),
                is(6_000));
    }

    @Test
    public void carLoanForOldRichPerson() {
        assertThat(calculator.getLoan(new Person(60, 2_000),
                LoanType.CAR),
                is(7_000));
    }

    @Test
    public void houseLoanForYoungPoorPerson() {

        assertThat(calculator.getLoan(new Person(20, 500),
                LoanType.HOUSE),
                is(100_000));
    }

    @Test
    public void houseLoanForOldPoorPerson() {

        assertThat(calculator.getLoan(new Person(60, 500),
                LoanType.HOUSE),
                is(100_000));
    }

    @Test
    public void houseLoanForYoungRichPerson() {
        assertThat(calculator.getLoan(new Person(20, 65_000),
                LoanType.HOUSE),
                is(200_000));
    }

    @Test
    public void houseLoanForOldRichPerson() {
        assertThat(calculator.getLoan(new Person(60, 65_000),
                LoanType.HOUSE),
                is(400_000));
    }
}
