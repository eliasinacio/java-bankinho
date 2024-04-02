package bank;

import java.util.ArrayList;

public class Bank {
	ArrayList<Currency> currencies = new ArrayList<Currency>();
	
	public void add (Currency newCur) {
		boolean currencyAlreadyExists = false;

		for (Currency actualCur : currencies) {
			if (actualCur.getClass().equals(newCur.getClass())) {
				currencyAlreadyExists = true;

				actualCur.value += newCur.value;
				break;
			}
		}

		if (!currencyAlreadyExists) {
			currencies.add(newCur);
		}

		System.out.println("");
		System.out.println("Moeda adicionada com sucesso!");
	}

	public void remove (Currency cur) {
		boolean currencyAlreadyExists = false;

		for (Currency actualCur : currencies) {
			if (actualCur.getClass().equals(cur.getClass())) {
				currencyAlreadyExists = true;

				if (actualCur.value > cur.value) {
					actualCur.value -= cur.value;
					
					System.out.println("");
					System.out.println("Moeda alterada com sucesso!");
				} else {
					int i = currencies.indexOf(actualCur);
					currencies.remove(i);

					System.out.println("");
					System.out.println("Moeda removida com sucesso!");
				}

				break;
			}
		}

		if (!currencyAlreadyExists) {
			System.out.println("");
			System.out.println("Moeda não encontrada.");
		}
	}

	public ArrayList<Currency> list() {
        return this.currencies;
    }

	public double totalConvertedToBRL() {
        double total = 0;

        for (Currency cur : this.currencies) {
            total += cur.convert();
        }

        return total;
    }
}
