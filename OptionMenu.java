package atm.java.org;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account  {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
	public void getLogin() throws IOException{
		int x=1;
		do {
			try {
				data.put(147852, 451287);
				data.put(985632, 569823);
				
				System.out.println("Welcome to Atm");
				System.out.println("ENTER THE CUSTOMER NUMBER");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("ENTER PIN NUMBER");
				setPinNumber(menuInput.nextInt());
				
				}
			catch (Exception e) {
				System.out.println("\n" + "INVALID CHARECTER(S).ONLY NUMBERS."+ "\n");
				x=2;
			}
       int cn=getCustomerNumber();
       int pn=getPinNumber();
       if (data.containsKey(cn) && data.get(cn) ==pn) {
    	   getAccountType();
       }
       else
    	   System.out.println("\n"+ "WRONG CUSTOMER NUMBER"+"\n");
		}while (x==1);
	}
	public void getAccountType() {
		System.out.println("SELECT THE ACCOUNT YOU WANT TO ACCESS:");
		System.out.println(" TYPE 1 - CHECKING ACCOUNT");
		System.out.println(" TYPE 2 - SAVING ACCOUNT");
		System.out.println(" TYPE 3 - EXIT");
		
		int selection = menuInput.nextInt();
		switch (selection) {
		case 1:
			getChecking();
			break;
			
		case 2:
		    getSaving();
		    break;
		
		case 3:
			System.out.println("THANK YOU FOR USING ATM, BYE BYE... \n");
		    break;
		    
	    default:
	    	System.out.println("\n" + "INVALID CHOICE." + "\n");
	    	getAccountType();
		}
	}
	
	public void getChecking() {
		System.out.println("CHECKING ACCOUNT:");
		System.out.println(" TYPE 1 - VIEW BALANCE");
		System.out.println(" TYPE 2 - WITHDRAW FUNDS");
		System.out.println(" TYPE 3 - DEPOSIT FUNDS");
	    System.out.println(" TYPE 4 - EXIT");
	    System.out.println("CHOICE:");
		
	    int selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;

		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;

		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thank You for using this ATM, bye.");
			break;

		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getChecking();
		}
	}

	public void getSaving() {
		System.out.println("Saving Account: ");
		System.out.println(" Type 1 - View Balance");
		System.out.println(" Type 2 - Withdraw Funds");
		System.out.println(" Type 3 - Deposit Funds");
		System.out.println(" Type 4 - Exit");
		System.out.print("Choice: ");

		int selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;

		case 2:
			getsavingWithdrawInput();
			getAccountType();
			break;

		case 3:
			getSavingDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thank You for using this ATM, bye.");
			break;

		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getChecking();
		}
	}

	}

