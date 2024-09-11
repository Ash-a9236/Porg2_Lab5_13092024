package ash_a9236.example;

public class CashPayment extends Payment {

    private double cashAmount;
    private double cashDue;

    public CashPayment(double toPay, double paymentAmount, String currency, String paymentType,
                       double cashAmount, double cashDue) {
        super(toPay, paymentAmount, currency, paymentType);
        this.cashAmount = cashAmount;
        this.cashDue = cashDue;
    }

    public static double amountToReturn (double cashAmount, double toPay) {
        double cashDue = cashAmount - toPay;
        if (cashDue > 0) {
            System.out.printf("Balance not completely paid, %f left to pay", cashDue * -1);
            return toPay = cashDue * -1;
        }
        return cashDue;
    }


    public double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }

    public double getCashDue() {
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
