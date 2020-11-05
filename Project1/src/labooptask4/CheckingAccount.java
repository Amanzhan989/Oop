package labooptask4;

public class CheckingAccount extends Account{
	
	private int free_transaction;
	public CheckingAccount(int accNumber) {
		super(accNumber);
	}
	static final double fee = 0.02;
	public double deductFee() {
		free_transaction+=1;
		super.setBalance(super.getBalance()-fee);
		return free_transaction;
	}
	
}
