package ash_a9236.example;

public class CashPayment extends Payment {

    private int cashAmount;
    private int cashDue;

    public CashPayment(double paymentAmount, String currency, int cashAmount, int cashDue) {
        super(paymentAmount, currency);
        this.cashAmount = cashAmount;
        this.cashDue = cashDue;
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
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
