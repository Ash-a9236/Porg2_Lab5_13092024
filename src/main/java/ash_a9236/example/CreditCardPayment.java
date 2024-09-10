package ash_a9236.example;

public class CreditCardPayment extends Payment {
    private String fName;
    private String lName;
    private int expirationDate;
    private int creditCardNum;

    public CreditCardPayment(double paymentAmount, String currency, String fName, String lName, int expirationDate, int creditCardNum) {
        super(paymentAmount, currency);
        this.fName = fName;
        this.lName = lName;
        this.expirationDate = expirationDate;
        this.creditCardNum = creditCardNum;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(int creditCardNum) {
        this.creditCardNum = creditCardNum;
    }


/*______________________________________________________________________________________________________________________
Question 01

Define a class named CreditCardPayment that is derived from Payment. This class should contain instance variables
for the name on the card, expiration date, and credit card number.

Include appropriate constructor(s). Finally, redefine the paymentDetails method to include all credit card information
in the printout.

Create a main method that creates at least two CashPayment and two CreditCardPayment objects with different values
and calls paymentDetails for each.
*/
}
