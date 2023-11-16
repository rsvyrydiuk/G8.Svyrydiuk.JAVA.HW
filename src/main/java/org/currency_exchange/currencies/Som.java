package org.currency_exchange.currencies;

public class Som extends Currency implements IsCurrency {
    public Som(double kursNBU) {
        super(kursNBU);
    }
    @Override
    String getCurrencyName() {
        return "Som";
    }
    @Override
    public boolean isFreeConv() {
        return false;
    }
}
