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

  public int getPinNumber(in pinNumber) {
    return pinNumber;
  }

  double getCheckingBalance() {
		return checkingBalance;
	}

  public double getSavingBalance() {
		return savingBalance;
	}

	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}

  
}
