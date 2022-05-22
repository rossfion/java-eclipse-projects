package bankaccountapp;

public class CheckingAccount extends Account {
	// List properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPin;

	// Constructor to initialize checking account properties
	public CheckingAccount(String name, String SSN, double initDeposit) {
		super(name, SSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();

	}

	@Override
	public void setRate() {
		rate = getBaseRate() * .15;

	}

	// List any methods specific to the checking account
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Your checking account features" + "\n Debit Card Number: " + debitCardNumber
				+ "\n Debit Card PIN: " + debitCardPin);
	}

}
