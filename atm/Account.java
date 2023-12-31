import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Account {

  Scanner input = new Scanner(System.in);
  DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

  private int customerNumber;
  private int pinNumber;

  private double checkingBalance = 0;
  private double savingBalance = 0;

  public int setCustomerNumber(int customerNumber) {
    this.customerNumber = customerNumber;
    return customerNumber;
  }

  public int getCustomerNumber(int customerNumber) {
    return customerNumber;
  }

  public int setPinNumber(int pinNumber) {
    this.pinNumber = pinNumber;
    return pinNumber;
  }

  public int getPinNumber(int pinNumber) {
    return pinNumber;
  }

  // Checking Account Operations 
  double getCheckingBalance() {
    return checkingBalance;
  }


  public double calcCheckingWithdraw(double amount) {
    checkingBalance = (checkingBalance - amount);
    return checkingBalance;
  }

  public double calcCheckingDeposit(double amount) {
    checkingBalance = (checkingBalance + amount);
    return checkingBalance;
  }

  public void getCheckingWithdrawInput() {
    System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance) + "\n");
    System.out.println("Amount you want to withdraw from Checking Account: ");
    double amount = input.nextDouble();

    if ((checkingBalance - amount) >= 0) {
      calcCheckingWithdraw(amount);
      System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
    } else {
      System.out.println("Not enough money" + "\n");
    }
  }

  public void getCheckingDepositInput() {
    System.out.println("Checking Deposit Account Balance: " + moneyFormat.format(checkingBalance) + "\n");
    System.out.println("Amount you want to deposit to Checking Account: ");

    double amount = input.nextDouble();

    if ((checkingBalance + amount) >= 0) {
      calcCheckingDeposit(amount);
      System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
    } else {
      System.out.println("Balance cannot be negative" + "\n");
    }
  }

  // Saving Account operations
  public double getSavingBalance() {
    return savingBalance;
  }

  public double calcSavingWithdraw(double amount) {
    savingBalance = (savingBalance - amount);
    return savingBalance;
  }

  public double calcSavingDeposit(double amount) {
    savingBalance = (savingBalance + amount);
    return savingBalance;
  }

  public void getSavingWithdrawInput() {
    System.out.println("Checking Saving Account Balance: " + moneyFormat.format(savingBalance) + "\n");
    System.out.println("Amount you want to withdraw from Saving Account: ");
    double amount = input.nextDouble();
    
    if ((savingBalance - amount) >= 0) {
      calcSavingWithdraw(amount);
      System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance));
    } else {
      System.out.println("Not enough money" + "\n");
    }
  }

  public void getSavingDepositInput() {
    System.out.println("Checking Saving Account Balance: " + moneyFormat.format(checkingBalance) + "\n");
    System.out.println("Amount you want to deposit to Checking Account: ");
    double amount = input.nextDouble();
    if ((getSavingBalance() + amount) >= 0) {
      calcCheckingDeposit(amount);
      System.out.println("New Saving Account balance: " + moneyFormat.format(checkingBalance));
    } else {
      System.out.println("Balance cannot be negative" + "\n");
    }
  }
}
