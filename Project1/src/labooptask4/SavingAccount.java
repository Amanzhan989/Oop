package labooptask4;

public class SavingAccount extends Account {
	
	double interest = super.getBalance()*0.01;
	
	public SavingAccount(int accNumber) {
		super(accNumber);
	}
	public double addInterest() {
		return super.getBalance()+interest;
	}

}
