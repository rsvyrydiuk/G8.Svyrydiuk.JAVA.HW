package org.currency_exchange.currencies;

public class Euro extends Currency implements IsCurrency {
    public Euro(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Euro";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }

}
