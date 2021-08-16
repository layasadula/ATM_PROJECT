import java.io.IOException;


import java.util.*;
import java.text.*;
public class OptionMenu extends Account {
Scanner menuInput =new Scanner(System.in);
DecimalFormat moneyFormat =new DecimalFormat("'$'####,##0.00");
HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
int Selection;
public void getlogin() throws IOException{
	int x=1;
	do {
		try {
			data.put(9876543,9876);
			data.put(987879,5431);
			data.put(987312,1234);
			System.out.println("WELCOME TO ATM!");
			System.out.println("ENTER YOUR CUSTOMER NUMBER");
			
			SetCustomerNumber(menuInput.nextInt());
			System.out.println("ENTER YOUR PIN");
			SetPinNumber(menuInput.nextInt());
		}
		catch(Exception e) {
			System.out.println("\n"+"Invalid Character(s) only numbers"+"\n");
			x=2;
			}
	for(Map.Entry<Integer,Integer> entry : data.entrySet()) {
		
			if(entry.getKey()==getCustomerNumber()&& entry.getValue()==getPinNumber()) {
				getAccountType();
			}
		}
		System.out.println("\n"+"wrong customer or pin"+"\n");
	}while(x==1);
}
public void getAccountType() {
	System.out.println("Select the account you want to Access");
	System.out.println("Type 1-Checking Account");
	System.out.println("Type 2-Saving Account");
	System.out.println("Type 3-Exit");
	System.out.println("Choice");
	 Selection=menuInput.nextInt();
	switch(Selection) {
	case 1:
		getChecking();
		break;
	case 2:
		getSaving();
		break;
	case 3:
		System.out.println("Thank you for using this ATM");
		System.exit(0);
		break;
	default:
		System.out.println("Invalid choice");
		getAccountType();
	}
}
public void getChecking() {
	System.out.println("Checking Account:");
	System.out.println("Type 1-View balance");
	System.out.println("Type 2-Withdraw Funds");
	System.out.println("Type 3-Deposit Funds");
	System.out.println("Type 4-Exit");
	System.out.println("Choice:");
	Selection=menuInput.nextInt();
	switch(Selection) {
	case 1:System.out.println("Checking Account Balance"+moneyFormat.format(getCheckingAccountBalance()));
	getAccountType();
	break;
	case 2:getCheckingWithDrawInput();
	getAccountType();
	break;
	case 3:getCheckingDepositInput();
	getAccountType();
	break;
	case 4:System.out.println("thank you for using ATM");
	System.exit(0);
	default:System.out.println("\n"+"Inavlid choice"+"\n");
	getChecking();
	
	}
}
public void getSaving() {
	System.out.println("Checking Account:");
	System.out.println("Type 1-View balance");
	System.out.println("Type 2-Withdraw Funds");
	System.out.println("Type 3-Deposit Funds");
	System.out.println("Type 4-Exit");
	System.out.println("Choice:");
	Selection=menuInput.nextInt();
	switch(Selection) {
	case 1:System.out.println("Checking Account Balance"+moneyFormat.format(getSavingAccountBalance()));
	getAccountType();
	break;
	case 2:getSavingWithDrawInput();
	getAccountType();
	break;
	case 3:getSavingDepositInput();
	getAccountType();
	break;
	case 4:System.out.println("thank you for using ATM");
	default:System.out.println("\n"+"Inavlid choice"+"\n");
	getSaving();
	
	}
}

	
}
