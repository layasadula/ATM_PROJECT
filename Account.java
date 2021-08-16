import java.text.DecimalFormat;
import java.util.*;


public class Account {
Scanner input=new Scanner(System.in);
DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
/*set customer number*/
public int SetCustomerNumber(int customerNumber) {
	this.customerNumber=customerNumber;
	return customerNumber;
	
}
/*get customer number*/
public int getCustomerNumber() {
	return customerNumber;
}
/* set customer pin*/
public int SetPinNumber(int pinNumber) {
	this.pinNumber=pinNumber;
	return pinNumber;
}
/*get pin number*/
public int getPinNumber() {
	return pinNumber;
}
/*get Checking Account Balance*/
public double getCheckingAccountBalance() {
	return checkingBalance;
}
public double getSavingAccountBalance() {
	return savingBalance;
}
public double calCheckingWithdraw(double amount) {
	checkingBalance=(checkingBalance-amount);
	return checkingBalance;
}
public double calSavingWithdraw(double amount) {
	savingBalance=(savingBalance-amount);
	return savingBalance;
}
public double calCheckingDeposit(double amount) {
	checkingBalance=(checkingBalance+amount);
	return checkingBalance;
}
public double calSavingDeposit(double amount) {
	savingBalance=(savingBalance+amount);
	return savingBalance;
}
public void getCheckingWithDrawInput() {
	System.out.println("Checking Account Balance:"+moneyFormat.format(checkingBalance));
	System.out.println("Amount you want to withdraw from checking Account");
	double amount=input.nextDouble();
	if((checkingBalance-amount)>=0) {
		calCheckingWithdraw(amount);
		System.out.println("New Checking Account Balance:"+moneyFormat.format(checkingBalance));
	}else {
		System.out.println("Balance cannot be negative"+"\n");
	}
}
public void getSavingWithDrawInput() {
	System.out.println("Checking Account Balance:"+moneyFormat.format(savingBalance));
	System.out.println("Amount you want to withdraw from saving Account");
	double amount=input.nextDouble();
	if((savingBalance-amount)>=0) {
		calSavingWithdraw(amount);
		System.out.println("New saving Account Balance:"+moneyFormat.format(savingBalance));
	}else {
		System.out.println("Balance cannot be negative"+"\n");
	}
}
public void getCheckingDepositInput() {
	System.out.println("Chacking Account Balance:"+moneyFormat.format(checkingBalance));
	System.out.println("Amount you want to deposit from checking Account");
	double amount=input.nextDouble();
	if((checkingBalance+amount)>=0) {
		calCheckingDeposit(amount);
		System.out.println("New Checking Account Balance:"+moneyFormat.format(checkingBalance));
	}else {
		System.out.println("Balance cannot be negative"+"\n");
	}
}
public void getSavingDepositInput() {
	System.out.println("Chacking Account Balance:"+moneyFormat.format(savingBalance));
	System.out.println("Amount you want to deposit from saving Account");
	double amount=input.nextDouble();
	if((savingBalance+amount)>=0) {
		calSavingDeposit(amount);
		System.out.println("New saving Account Balance:"+moneyFormat.format(savingBalance));
	}else {
		System.out.println("Balance cannot be negative"+"\n");
	}
}
private int customerNumber;
private int pinNumber;
private double checkingBalance=0;
private double savingBalance=0;
	}
