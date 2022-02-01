package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iSales.IShippingPolicy;

public class FreeShipping implements IShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        sale.shipping = 0.00;
    }
}