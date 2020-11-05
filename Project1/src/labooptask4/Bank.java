package labooptask4;
import java.util.*;
public class Bank {
	public Bank() {};
	Scanner in = new Scanner(System.in);
	Vector <Account> v = new Vector<Account>();
	public void update(Account acc) {
		menu: while(true) {
			System.out.println("What are you want to do?\n1 Withdraw\n2 Check balance\n3 Transfer\n4 Rifill\n5 Out");
			String s1 = in.next();
			if(s1.equals("1")) {
				System.out.println("How many dollars do you want withdraw?");
				int withdraw = in.nextInt();
				if(acc.getBalance() < withdraw) {
					System.out.println("You don't have enought money");
					System.exit(0);
					}
				else {
					if(acc instanceof CheckingAccount) {
						double chek = ((CheckingAccount)acc).deductFee();
					}
					else if(acc instanceof SavingAccount) {
						double save = ((SavingAccount)acc).addInterest();
					}
				}
			}
			else if(s1.equals("2")) {
				System.out.println(acc.getBalance());
				System.exit(0);
			}
			else if(s1.equals("3")) {
				System.out.println("How many dollars do you want transfer:\n");
				int mon = in.nextInt();
				System.out.println("Please write number card:\n");
				int idCard = in.nextInt();
				for(int i = 0; i < account.size();i++) {
					for(Account a:account.values()) {
						if(a.getAccNumber()==idCard) {
							acc.transfer(amount, a);
							break menu;
						}
					}
				}
			}
			else if(s1.equals("4")) {
				System.out.println("Which card do you want insert?");
				int cardNumber = in.nextInt();
				System.out.println("How many doolars do you want insert?");
				int ins = in.nextInt();
				acc.refill(ins);
			}
			else {
				System.out.println("Don't forget to take your card");
				System.exit(0);
			}
			
		}
	}
	public void openAccount(acc) {
		v.add(acc);
	}
	public static void main(String[] args) {
		Bank bank = new Bank();
		Vector<Integer>account = new Vector<Integer>(); 
	}

}
