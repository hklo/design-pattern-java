package com.training.lib.strategy.Interface;

import com.training.lib.strategy.Invoice;

public interface ITaxCal {
    double getCal(Invoice invoice);
}
