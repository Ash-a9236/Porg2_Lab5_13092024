package ash_a9236.example;

public class CreditCardPayment extends Payment {
    private String fName;
    private String lName;
    private int expirationDate;
    private String creditCardNum;

    public CreditCardPayment(double toPay, double paymentAmount, String currency, String paymentType, String fName, String lName,
                             int expirationDate, String creditCardNum) {
        super(toPay, paymentAmount, currency, paymentType);
        this.fName = fName;
        this.lName = lName;
        this.expirationDate = expirationDate;
        this.creditCardNum = creditCardNum;
    }

    public static void creditCardInfo (String fName, String lName, String creditCardNum, int expirationDate) {
        System.out.printf("Name on card : %s %s\nExpiration : %d\nCard number : %s", fName, lName, expirationDate,
                transformCreditCardNum(creditCardNum));
    }

    public static void hiddenCreditCardInfo (String fName, String lName, String creditCardNum, int expirationDate) {
        System.out.printf("Name on card : %s %s\nExpiration : %d\nCard number : %s", fName, lName, expirationDate,
                hideCreditCardNums(creditCardNum));

    }

    public static String transformCreditCardNum (String creditCardNum) {
        String creditCardNumStr = "";

        creditCardNumStr += creditCardNum.substring(0, 3) + " " + creditCardNum.substring(4, 7) + " "
                + creditCardNum.substring(8, 11) + " " + creditCardNum.substring(12, 15);

        return creditCardNumStr;
    }

    public static String hideCreditCardNums (String creditCardNum) {
        String creditCardNumStr = "";

        creditCardNumStr += "************" + creditCardNum.substring(12, 15);

        return creditCardNumStr;
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

    public String getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(String creditCardNum) {
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
