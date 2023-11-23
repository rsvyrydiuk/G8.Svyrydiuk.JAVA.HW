package org.currency_exchange.menu;

import org.currency_exchange.currencies.Currency;

public class ActionsMenu extends Menu {

    public static void printActionsMenu(Currency workingCurrency) {
        System.out.println();
        System.out.println("Choose action for " + workingCurrency.getCurrencyName() + " : ");
        System.out.println("1 :Change Currency to Grn  ");
        System.out.println("2 :Change Grn to Currency ");
        System.out.println("3 :Change kurs NBU ");
        System.out.println("4 :Show kurs NBU ");
        System.out.println("100: Exit from menu");
        System.out.println("Your choice : ");
    }

    public static void doActionsWithCurrency(Currency workingCurrency, int subMenuNumber) {
        switch (subMenuNumber) {
            case 1:
                System.out.println("Enter number of currency " + workingCurrency.getCurrencyName() + " :");
                double numberOfCurrency = getDoubleFromConsole();
                workingCurrency.exchangeCurrencyToGrn(numberOfCurrency);
                break;
            case 2:
                System.out.println("Enter number of Grn :");
                workingCurrency.exchangeGrnToCurrency(getDoubleFromConsole());
                break;
            case 3:
                System.out.println("Enter new kurs NBU for currency:" + workingCurrency.getCurrencyName() + " :");
                workingCurrency.setKursNBU(getDoubleFromConsole());
                break;
            case 4:
                System.out.println(String.format(
                        "Kurs NBU for currency %s is: %s ",
                        workingCurrency.getCurrencyName(), workingCurrency.getKursNBU()
                ));
                break;

            default:
                System.out.println("No action with entered number " +subMenuNumber);
        }
    }
}
