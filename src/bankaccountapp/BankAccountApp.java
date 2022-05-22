package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();

		String file = "C:\\Users\\Fionn\\workspace\\JavaProjects\\JavaPortfolio\\src\\bankaccountapp\\NewBankAccounts.csv";

		// Read a CSV file then create new accounts based on the data
		List<String[]> newAccountHolders = utilities.ReadCSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			// System.out.println("NEW ACCOUNT");
			String name = accountHolder[0];
			String SSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);

			if (accountType.equals("Savings")) {
				accounts.add(new SavingsAccount(name, SSN, initDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new CheckingAccount(name, SSN, initDeposit));
			} else {
				System.out.println("Error reading account type");
			}

		}

		// accounts.get(5).showInfo(); // testing

		for (Account acc : accounts) {
			System.out.println("\n*******");
			acc.showInfo();
		}

	}

}
