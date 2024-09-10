package ash_a9236.example;

public class Payment {
    private double paymentAmount;
    private String currency;


    public Payment(double paymentAmount, String currency) {
        this.paymentAmount = paymentAmount;
        this.currency = currency;
    }

    public static void paymentDetails (double paymentAmount, String currency) {
        System.out.printf("The payment amount was of %.2f %s", paymentAmount, currency);
    }

    public static String currencyAbbreviation (String currency) {
        String currencyAbv = "";

        switch (currency) {
            case "Canadian Dollar":
                currencyAbv = "CA $";
                break;
            case "US Dollar", "American Dollar":
                currencyAbv = "US $";
                break;
            case "Australian Dollar":
                currencyAbv = "AU $";
                break;
            case "Euro":
                currencyAbv = "€";
                break;
            case "Pound", "Sterling", "Pound Sterling":
                currencyAbv = "£";
                break;
            case "Japanese Yen", "Renminbi", "Yuan", "Chinese Yuan":
                currencyAbv = "¥";
                break;
            case "Swiss franc", "franc":
                currencyAbv = "CHF";
                break;
            case "Hong Kong Dollar":
                currencyAbv = "HK $";
                break;
        }

        return currencyAbv;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /*______________________________________________________________________________________________________________________
Question 01

Define a class named Payment that contains an instance variable of type double that stores the amount of the payment
and appropriate accessor and mutator methods. Also create a method named paymentDetails that outputs an English sentence
to describe the amount of the payment.

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
