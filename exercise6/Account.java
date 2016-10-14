package exercise6;

public class Account extends Person {

	private int accountNumber;
	private int balance = 0;
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void withdraw(int amount){
		if (amount < 0 || amount > balance){
			System.out.println("Invalid amount for withdrawal");
			return;
		}
		balance -= amount;
		System.out.println("Withdrawal completed successfully, balance is now " + balance + " SEK");
	}
	
	public void deposit(int amount){
		if (amount < 0){
			System.out.println("Invalid amount for deposit");
			return;
		}
		balance -= amount;
		System.out.println("Deposit completed successfully, balance is now " + balance + " SEK");
	}

	@Override
	public String toString() {
		return "Account Number=" + accountNumber + " [Balance=" + balance + " SEK, Owner Name=" + getName()
				+ ", SSN=" + getSSN() + ", Address=" + getAddress() + ", Phone Number=" + getPhoneNumber()
				+ "]";
	}

	public Account() {
	}

}
