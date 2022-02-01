package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iSales.IShippingPolicy;

public class FlatRateShipping implements IShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        switch (sale.Country) {
            case "United States":
                sale.shipping = 5.99;
                break;
            case "Japan":
                sale.shipping = 14.50;
                break;
            case "India":
                sale.shipping = 11.79;
                break;
            case "Scotland":
                sale.shipping = 7.54;
                break;
            default: sale.shipping = 0.00;
        }
    }
}
