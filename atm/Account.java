import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Account {

  Scanner input = new Scanner(System.in);
  DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

  private int customerNumber;
  private int PinNumber;

  private double checkingBalance = 0;
  private double savingBalance = 0;

  
}