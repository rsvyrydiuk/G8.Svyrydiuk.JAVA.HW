package org.currency_exchange.currencies;

import java.text.DecimalFormat;

public abstract class Currency {


    private double kursNBU;
    private double marga = 1.1; //10%


    DecimalFormat df = new DecimalFormat("0.00");

    public Currency(double kursNBU) {
        this.kursNBU = kursNBU;
        setMarga(marga);
    }

    public abstract String getCurrencyName();

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
        if (!(this instanceof IsCurrency)) {// Bitcoin, Etherium, etc.
            this.marga = marga * 1.2;
            System.out.println(getCurrencyName() + " is NOT real currency!!!");
            System.out.println("So marga was changed. Current marga is " + df.format(this.marga));
        } else {
            if (((IsCurrency) this).isFreeConv() == false) {
                this.marga = marga * 1.1;
                System.out.println(getCurrencyName() + " is not free converted currency");
                System.out.println("So marga was changed. Current marga is " + df.format(this.marga));
            } else {
                System.out.println(getCurrencyName() + " is free converted currency");
                System.out.println("So marga was NOT changed. Current marga is " + df.format(this.marga));
            }

        }
    }

    public double getKursBuy() {
        return kursNBU * marga;
    }

    public double getKursSell() {
        return kursNBU / marga;
    }

    public double exchangeGrnToCurrency(double numberOfGrn) {
        Double tempResult = numberOfGrn / getKursBuy();
        System.out.println(String.format("For %s Grn you get %s by kurs %s %s (marga %s)"
                , numberOfGrn, df.format(tempResult), getCurrencyName(), df.format(getKursBuy()), df.format(marga)));
        return tempResult;
    }

    public double exchangeCurrencyToGrn(double numberOfCurrency) {
        Double tempResult = numberOfCurrency * getKursSell();
        System.out.println(String.format("For %s %s you get %s Grn %s UAH/%s (marga %s)"
                , numberOfCurrency, getCurrencyName(), df.format(tempResult), df.format(getKursSell()), getCurrencyName(), df.format(marga)));
        return tempResult;
    }

    public double exchangeBuy(Currency currency, double sum) {
        return sum * getKursBuy() / currency.getKursBuy();
    }


}
