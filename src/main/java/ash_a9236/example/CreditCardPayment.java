package ash_a9236.example;

public class CreditCardPayment extends Payment {
    private String fName;
    private String lName;
    private int expirationDate;
    private String creditCardNum;

    public CreditCardPayment(double toPay, double paymentAmount, String currency, String paymentType, String fName,
                             String lName, int expirationDate, String creditCardNum) {
        super(toPay, paymentAmount, currency, paymentType);
        this.fName = fName;
        this.lName = lName;
        this.expirationDate = expirationDate;
        this.creditCardNum = creditCardNum;
    }

    /**
     * Prints the credit card information with the non-hidden credit card number
     * @param fName the first name of the card holder
     * @param lName the last name of the card holder
     * @param creditCardNum the credit card number
     * @param expirationDate the expiration of the credit card
     */
    public static void creditCardInfo (String fName, String lName, String creditCardNum, int expirationDate) {
        System.out.printf("Name on card : %s %s\nExpiration : %d\nCard number : %s", fName, lName, expirationDate,
                transformCreditCardNum(creditCardNum));
    }

    /**
     * Prints the credit card information with the only the last 4 digits of the credit card number visible
     * @param fName the first name of the card holder
     * @param lName the last name of the card holder
     * @param creditCardNum the credit card number
     * @param expirationDate the expiration of the credit card
     */
    public static void hiddenCreditCardInfo (String fName, String lName, String creditCardNum, int expirationDate) {
        System.out.printf("Name on card : %s %s\nExpiration : %d\nCard number : %s", fName, lName, expirationDate,
                hideCreditCardNums(creditCardNum));
    }

    /**
     * Takes the credit card number and makes it more readable by grouping it in 4 groups of 4 digits
     * @param creditCardNum the input credit card number
     * @return the credit card number grouped in 4s
     */
    public static String transformCreditCardNum (String creditCardNum) {
        String creditCardNumStr = "";

        creditCardNumStr += creditCardNum.substring(0, 3) + " " + creditCardNum.substring(4, 7) + " "
                + creditCardNum.substring(8, 11) + " " + creditCardNum.substring(12, 15);

        return creditCardNumStr;
    }

    /**
     * Takes the credit card number and remplaces the first 12 digits by '*' to hide them
     * @param creditCardNum the input credit card number
     * @return the 12 digits hidden and the last 4 after
     */
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
}
