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
          getAccountTypeMenu();
        } else {
          System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
        }
      } catch (Exception e) {
        System.out.println("\n" + "Invalid character(s). Only numbers are allowed!" + "\n");
        menuInput.nextLine();
      }
    } while (true);
  }

  public void getAccountTypeMenu() {

    System.out.println("Select the account you want to access!");
		System.out.println("Type 1: Checking Account");
		System.out.println("Type 2: Saving Account");
		System.out.println("Type 3: Exit");
		System.out.println("Choice: ");

    selectedAccountType = menuInput.nextInt();

    switch (selectedAccountType) {
      case 1:
        // get checking account:
        getCheckingAccount();
        break;
      case 2:
        // get saving account:
        break;
      case 3:
        // exit:
        System.out.println("Thank you for using this ATM, see you soon!");
        break;
      default:
        System.out.println("Invalid Choice." + "\n");
        getAccountType();
    }
  }

  public void getCheckingAccount() {
    System.out.println("Checking account! Select options:");
    System.out.println("Type 1: View Balance");
    System.out.println("Type 2: Withdraw Funds");
    System.out.println("Type 3: Deposit Funds");
    System.out.println("Type 4: Exit");
    System.out.println("Choice: ");

    int selectionCheckingAccount = menuInput.nextInt();

    switch (selectionCheckingAccount) {
    case 1:
      // get checking balance
      System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
      getAccountType();
      break;
    case 2:
      System.out.println("Checking Withdraw Funds: ");
      // get checking withdraw funds
      getCheckingWithdrawInput();
      getAccountType();
      break;
    case 3:
      System.out.println("Checking Deposit Funds: ");
      // get checking deposit
      getCheckingDepositInput();
      getAccountType();
      break;
    case 4:
      System.out.println("Operation with Checking account is ending...");
      getAccountType();
      break;
    default:
      System.out.println("Invalid Choice." + "\n");
      getChecking();
    }
  }


}