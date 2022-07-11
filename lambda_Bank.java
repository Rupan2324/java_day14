package myio;
import java.io.*;
	interface Atm1 {
		public abstract void withDraw(int wamount,String Name);
	}
	interface Cdm1{
		public abstract void deposit(int damount,String Name);
	}
	public class lambda_Bank {
		int balance;
		lambda_Bank(int balance)
		{	
			this.balance = balance;
		}
		public void showBalance() {
			System.out.println("The Opening Balance is: "+this.balance);
		}
		public static void main(String[] args) {
			String name = null;
			String balString = null;
			String depositString = null;
			String withdrawString = null;
			int balance = 0;
			int depositAmount = 0;
			int withdrawAmount = 0;
			try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter Name: ");
				name = br.readLine();
				System.out.println("Enter opening balance: ");
				balString = br.readLine();
				balance = Integer.parseInt(balString);
				System.out.println("Enter deposit Amount: ");
				depositString = br.readLine();
				depositAmount = Integer.parseInt(depositString);
				System.out.println("Enter withdraw Amount: ");
				withdrawString = br.readLine();
				withdrawAmount = Integer.parseInt(withdrawString);
			} catch (Exception e) {
				System.out.println(e);
			}
			lambda_Bank lb = new lambda_Bank(balance);
			lb.showBalance();
			Cdm1 c = (int damount,String Name) -> {
				lb.balance = lb.balance+damount;
				System.out.println("Deposit amount of " +Name+" is: "+damount);
				System.out.println("Balance amount of "+Name+" is: "+lb.balance);
			};
			c.deposit(depositAmount, name);
			Atm1 a = (int wamount,String Name) -> {
				lb.balance = lb.balance - wamount;
				System.out.println("Withdraw amount of " +Name+" is: "+wamount);
			System.out.println("Balance amount of "+Name+" is: "+lb.balance);
			};
			a.withDraw(withdrawAmount,name);
			
		}
}
