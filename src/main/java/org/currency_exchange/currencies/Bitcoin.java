package org.currency_exchange.currencies;

public class Bitcoin extends Currency implements isCryptoCurrency{
    public Bitcoin() {
        super( 37000);
    }

    @Override
    String getCurrencyName() {
        return "BTC";
    }

    @Override
    public boolean isCryptoCurrency() {
        return true;
    }

    public double exchangeGrnToCurrency(double numberOfGrn) {

        System.out.println(String.format("The exchange of cryptocurrency %s is prohibited by the NBU --- we back your money = %s Grn" ,getCurrencyName(),  +numberOfGrn));
       return  numberOfGrn;
    }
}
