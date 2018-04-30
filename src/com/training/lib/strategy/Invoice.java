package com.training.lib.strategy;

import com.training.lib.strategy.Interface.ITaxCal;

public class Invoice {
    private ITaxCal taxCal;

    public Invoice(ITaxCal taxCal) {
        setTaxCal(taxCal);
    }

    public double getTotal() {
        return 100;
    }

    public double getTaxCal() {
        return taxCal.getCal(this);
    }

    public void setTaxCal(ITaxCal taxCal) {
        this.taxCal = taxCal;
    }
}
