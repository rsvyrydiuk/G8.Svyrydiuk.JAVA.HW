package org.currency_exchange.currencies;

public class Som extends Currency implements IsCurrency {
    public Som(double kursNBU) {
        super(kursNBU);
    }
    @Override
    public String getCurrencyName() {
        return "Som";
    }
    @Override
    public boolean isFreeConv() {
        return false;
    }
}
