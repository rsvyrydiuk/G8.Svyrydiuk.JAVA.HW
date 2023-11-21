package org.currency_exchange;

import org.currency_exchange.currencies.Dollar;
import org.currency_exchange.currencies.Euro;
import org.currency_exchange.currencies.MapOfCurrencies;
import org.currency_exchange.currencies.Som;
import org.currency_exchange.menu.Menu;
import org.currency_exchange.menu.MenuCurrency;
import org.currency_exchange.currencies.Currency;



public class CurrencyExchange {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(38);
        Euro euro = new Euro(40);
        //   Som som = new Som(0.001);


        MapOfCurrencies.addCurrency(dollar);
        MapOfCurrencies.addCurrency(euro);
        MapOfCurrencies.addCurrency(new Som(0.001));

        final int EXIT_NUMBER = 100;
        int currencyNumber;
        Currency workingCurrency;
        do {
            MenuCurrency.printCurrencyMenu();
            currencyNumber = Menu.getNumberFromConsole();
            //   System.out.println("Number = " + currencyNumber);
            if (currencyNumber == 0) {
                System.out.println("Wrong currency!!! Try again");
                continue;
            } else if(currencyNumber != EXIT_NUMBER) {
                workingCurrency=MenuCurrency.setCurrency(currencyNumber);
                System.out.println("Currency: is " + workingCurrency.getCurrencyName());
            }

        } while (currencyNumber != EXIT_NUMBER);
        System.out.println("Goodbye!!!");
    }

}
