package com.training.lib.strategy;

import com.training.lib.strategy.Interface.ITaxCal;

public class TaxCal10 implements ITaxCal {

    @Override
    public double getCal(Invoice invoice) {
        return invoice.getTotal() * .1;
    }
}
