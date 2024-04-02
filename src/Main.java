import bank.Bank;
import bank.Currency;
import bank.Dollar;
import bank.Euro;
import bank.Real;
import menu.Menu;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Menu menu = new Menu();

		int menuOption = 99;

		while (menuOption != 0) {
			menu.showMainMenu();
			menuOption = menu.getOption(0, 4);

			if (menuOption == 1) {
				menu.showCurrencyTypeMenu();
				int currencyOption = menu.getOption(0, 3);
				
				menu.showCurrencyValueMenu();
				double value = menu.getValue();

				Currency currency;

				if (currencyOption == 1) {
                    currency = new Real(value);
                } else if (currencyOption == 2) {
                    currency = new Dollar(value);
                } else {
                    currency = new Euro(value);
                }

				bank.add(currency);

			} else if (menuOption == 2) {
				menu.showCurrencyTypeMenu();
				int currencyOption = menu.getOption(0, 3);
				
				menu.showCurrencyValueMenu();
				double value = menu.getValue();

				Currency currency;

				if (currencyOption == 1) {
                    currency = new Real(value);
                } else if (currencyOption == 2) {
                    currency = new Dollar(value);
                } else {
                    currency = new Euro(value);
                }

				bank.remove(currency);

			} else if (menuOption == 3) {
				System.out.println("");

				for (Currency currency : bank.list()) {
					currency.info();
				}
			} else if (menuOption == 4) {
				double totalInBrl = bank.totalConvertedToBRL();

				System.out.println("");
				System.out.println("Total em reais:");
				System.out.println("R$ " + totalInBrl);
			}
		}

		System.out.println("Encerrando...");
	}
}
