import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;


public class OptionMenu extends Account {

  Scanner menuInput = new Scanner(System.in);
  DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
  HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

  public void getLogin() {

    int x = 1;
    data.put(123456789, 1111);
    data.put(987654321, 2222);

    do {
      try {
        System.out.println("\n" + "Welcome to ATM machine!" + "\n");
        // Get Customer Account Number
        System.out.println("Enter your Account Number: ");
        int enteredCustomerNumber = menuInput.nextInt();
        // Get Customer Pin Number
        System.out.println("Enter your Pin Number: ");
        int enteredPinNumber = menuInput.nextInt();

        if (data.containsKey(enteredCustomerNumber) && data.containsKey(enteredCustomerNumber).equals(enteredPinNumber)) {
          // Set customer account number and pin number
          setCustomerNumber(enteredCustomerNumber);
          setPinNumber(enteredPinNumber);
          // open options:
          
        } else {
          System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
        }
      } catch (Exception e) {
        System.out.println("\n" + "Invalid character(s). Only numbers are allowed!" + "\n");
        menuInput.nextLine();
      }
    } while (true);

  }
}