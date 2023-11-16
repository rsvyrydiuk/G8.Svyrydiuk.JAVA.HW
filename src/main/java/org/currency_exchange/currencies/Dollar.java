package org.currency_exchange.currencies;

public class Dollar extends Currency implements IsCurrency {
    public Dollar(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "USD";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }

}
