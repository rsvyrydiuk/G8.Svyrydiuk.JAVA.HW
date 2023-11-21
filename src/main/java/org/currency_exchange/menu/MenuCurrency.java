package org.currency_exchange.menu;


import org.currency_exchange.currencies.*;
import org.currency_exchange.currencies.Currency;

public class MenuCurrency extends Menu {
    public static void printCurrencyMenu() {
        System.out.println("");
        System.out.println("Choose currency:");
        System.out.println("1. Dollar");
        System.out.println("2. Euro");
        System.out.println("3. Uz Som");
        System.out.println("100: for Exit");
        System.out.println("Enter your choice:");
    }


    public static Currency setCurrency(int currencyNumber) {
        Currency tempCurrency = null;
        switch (currencyNumber) {
            case 1:
                //System.out.println("Dollar");
                tempCurrency = MapOfCurrencies.getCurrencyHashMap().get("USD");
                break;
            case 2:
               // System.out.println("Euro");
                tempCurrency = MapOfCurrencies.getCurrencyHashMap().get("Euro");
                break;
            case 3:
                //System.out.println("Som");
                tempCurrency = MapOfCurrencies.getCurrencyHashMap().get("Som");
                break;
            default:
                System.out.println("Default currency: Dollar");
                tempCurrency = MapOfCurrencies.getCurrencyHashMap().get("USD");
        }

        return tempCurrency;
    }
}
