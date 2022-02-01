package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iSales.IShippingPolicy;

public class FreeShippingOverX implements IShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        if((sale.amount <= 49.99) && (sale.amount >= 0.00))
        {
            sale.shipping = 8.99;
        }
        else if ((sale.amount <= 99.99) && (sale.amount >= 50.00))
        {
            sale.shipping = 4.99;
        }
        else if ((sale.amount >= 100.00))
        {
            sale.shipping = 0.00;
        }
        }
}
