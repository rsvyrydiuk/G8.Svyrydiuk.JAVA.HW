package org.currency_exchange;

import org.currency_exchange.currencies.Dollar;
import org.currency_exchange.currencies.Som;

public class TempMainClassCurrency {
    public static void main(String[] args) {

        Dollar dollar = new Dollar(37.5);
        System.out.println(dollar.exchangeCurrencyToGrn(100));


        dollar.exchangeGrnToCurrency(4000);

        dollar.setKursNBU(38);

        dollar.exchangeCurrencyToGrn(110);

        Som som = new Som(0.0001);
        som.exchangeCurrencyToGrn(1000);
        System.out.println(som.isFreeConv());


    }
}
