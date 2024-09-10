package ash_a9236.example;

public class CashPayment extends Payment {

    private int cashAmout;
    private int cashDue;

    public CashPayment(double paymentAmount, String currency, int cashAmout, int cashDue) {
        super(paymentAmount, currency);
        this.cashAmout = cashAmout;
        this.cashDue = cashDue;
    }

    public int getCashAmout() {
        return cashAmout;
    }

    public void setCashAmout(int cashAmout) {
        this.cashAmout = cashAmout;
    }

    public int getCashDue() {
        return cashDue;
    }

    public void setCashDue(int cashDue) {
        this.cashDue = cashDue;
    }

    /*______________________________________________________________________________________________________________________
Question 01

Next, define a class named CashPayment that is derived from Payment. This class should redefine the paymentDetails
method to indicate that the payment is in cash. Include appropriate constructor(s).

Define a class named CreditCardPayment that is derived from Payment. This class should contain instance variables
for the name on the card, expiration date, and credit card number.

Include appropriate constructor(s). Finally, redefine the paymentDetails method to include all credit card information
in the printout.

Create a main method that creates at least two CashPayment and two CreditCardPayment objects with different values
and calls paymentDetails for each.
*/

}
