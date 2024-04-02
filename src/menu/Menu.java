package menu;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    public void showMainMenu() {
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("------    Bankinho    ------");
        System.out.println("----------------------------");
        System.out.println(" [ 1 ] Adicionar moeda ");
        System.out.println(" [ 2 ] Remover moeda ");
        System.out.println(" [ 3 ] Listar moedas ");
        System.out.println(" [ 4 ] Total em reais (R$) ");
        System.out.println(" [ 0 ] Sair ");
        System.out.println("----------------------------");
        System.out.println("");
        System.out.print("> ");
    }

    public void showCurrencyTypeMenu() {
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("Escolha a moeda: ");
        System.out.println("----------------------------");
        System.out.println(" [ 1 ] Real  (R$)");
        System.out.println(" [ 2 ] Dolar ($)");
        System.out.println(" [ 3 ] Euro  (€)");
        System.out.println("----------------------------");
        System.out.println("");
        System.out.print("> ");
    }

    public void showCurrencyValueMenu() {
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("Informe o valor da moeda: ");
        System.out.println("----------------------------");
        System.out.println("");
        System.out.print("> ");
    }

    public void showError() {
        System.out.println("");
        System.out.println("\u001B[31m Opção inválida. Tente novamente.\u001B[0m");
        System.out.println("");

        input.nextLine();
        System.out.println("> ");
    }

    public int getOption(int min, int max) {
        while (true) {
            try {
                int number = input.nextInt();

                if (number >= min && number <= max) {
                    return number;
                } else {
                    showError();
                }
            } catch (Exception error) {
                showError();
            }
        }
    }

    public double getValue() {
        while (true) {
            try {
                double number = input.nextDouble();

                return number;
            } catch (Exception error) {
                showError();
            }
        }
    }
}
