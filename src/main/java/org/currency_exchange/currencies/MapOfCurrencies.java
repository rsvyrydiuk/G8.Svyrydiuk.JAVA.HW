package org.currency_exchange.currencies;

import java.util.HashMap;

public class MapOfCurrencies {
    private static HashMap<String, Currency> currencyHashMap = new HashMap<>();


    public static void addCurrency(Currency currency){
        currencyHashMap.put(currency.getCurrencyName(), currency);
    }

    public static HashMap<String, Currency> getCurrencyHashMap(){
        return currencyHashMap;
    }
}
