package ash_a9236.example;

public class Main {
    public static void main(String[] args) {
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


/*______________________________________________________________________________________________________________________
Question 02

Define a class named Document that contains an instance variable of type String named text that stores any textual
content for the document. Create a method named toString that returns the text field and also include a method to set
this value.

Next, define a class for Email that is derived from Document and includes instance variables for the sender, recipient,
and title of an email message. Implement appropriate accessor and mutator methods. The body of the email message should
be stored in the inherited variable text. Redefine the toString method to concatenate all text fields.

Similarly, define a class for File that is derived from Document and includes a instance variable for the pathname.
The textual contents of the file should be stored in the inherited variable text. Redefine the toString method to
concatenate all text fields. Finally, create several sample objects of type Email and File in your main method. Test
your objects by passing them to the following subroutine that returns true if the object contains the specified keyword
in the text property.

    public static boolean ContainsKeyword(Document docObject, String keyword) {
        if (docObject.toString().indexOf(keyword,0) >= 0) {
            return true;
        }

        return false;
    }

*/

    }
}