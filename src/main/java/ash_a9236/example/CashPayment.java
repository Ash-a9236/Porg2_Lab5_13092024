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
}
