package labooptask4;

public class Account {
	private double balance;
	private int accNumber;
	
	public Account(int accNumber) {
		this.accNumber = accNumber;
		setBalance(100);
	}
	public void deposit(double sum) {
		balance += sum/9.6;
	}
	public void withdraw(double sum) {
		balance-=sum;
	}
	public double getBalance() {
		return balance;
	}
	public double getAccNumber() {
		return accNumber;
	}
	public void  transfer(double amount,Account other) {
		this.balance-=amount;
		other.balance+=amount;
	}
	public void refill(double amount) {
		balance+=amount;
	}
	public String toString() {
		return "This "+accNumber+" have " + balance + " dollars";
	}
	public final void print() {
		System.out.println(toString());
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
