package com.training.lib.strategy;

import com.training.lib.Interface.IExecutor;

public class StrategyExecutor implements IExecutor {

    @Override
    public void run() {
        Invoice invoice = new Invoice(new TaxCal06());
        System.out.println(invoice.getTaxCal());
        invoice.setTaxCal(new TaxCal10());
        System.out.println(invoice.getTaxCal());
    }
}
