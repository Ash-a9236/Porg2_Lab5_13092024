package ash_a9236.example;

public class Payment {
    private double toPay;
    private double paymentAmount;
    private String currency;
    private String paymentType;


    public Payment(double toPay, double paymentAmount, String currency, String paymentType) {
        this.toPay = toPay;
        this.paymentAmount = paymentAmount;
        this.currency = currency;
        this.paymentType = paymentType;
    }


    public static void paymentDetails (double toPay, double paymentAmount, String currency, String paymentType) {

        if (paymentType.toLowerCase() == "cash") {
            System.out.printf("The balance amount is of %.2f %s\nAdd cash amount : \n", paymentAmount, currency);
            CashPayment.amountToReturn(paymentAmount, toPay);

        } else if (paymentType.toLowerCase() == "card") {

        } else {

        }
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

    public double getToPay() {
        return toPay;
    }

    public void setToPay(double toPay) {
        this.toPay = toPay;
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

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
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
