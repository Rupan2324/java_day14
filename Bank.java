package myio;
import java.io.*;
interface ATM {
	public abstract void withDraw(int wamount,String Name);
}
interface CDM{
	public abstract void deposit(int damount,String Name);
}
public class Bank implements ATM,CDM{
	int balance;
	Bank(int balance)
	{	
		this.balance = balance;
	}
	public void deposit(int damount,String Name) {
		System.out.println("The Opening Balance of "+Name +" is: "+this.balance);
		// TODO Auto-generated method stub
		this.balance = this.balance + damount;
		System.out.println("Deposit amount of " +Name+" is: "+damount);
		System.out.println("Balance amount of "+Name+" is: "+this.balance);	
	}
	public void withDraw(int wamount,String Name) {
		// TODO Auto-generated method stub
		this.balance = this.balance - wamount;
		System.out.println("Withdraw amount of " +Name+ " is: "+wamount);
		System.out.println("Balance amount of " +Name+ " is: "+this.balance);
	}
	public static void main(String[] args) {
		String Name = null;
		String balString = null;
		String depositString = null;
		String withdrawString = null;
		int balance = 0;
		int depositAmount = 0;
		int withdrawAmount = 0;
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name: ");
			Name = br.readLine();
			System.out.println("Enter opening balance: ");
			balString = br.readLine();
			balance = Integer.parseInt(balString);
			System.out.println("Enter deposit Amount: ");
			depositString = br.readLine();
			depositAmount = Integer.parseInt(depositString);
			System.out.println("Enter withdraw Amount: ");
			withdrawString = br.readLine();
			withdrawAmount = Integer.parseInt(withdrawString);
			
			
		} catch (IOException e) {
			System.out.println(e);
		}
		Bank b1 = new Bank(balance);
		b1.deposit(depositAmount,Name);
		b1.withDraw(withdrawAmount,Name);	
	}
}
