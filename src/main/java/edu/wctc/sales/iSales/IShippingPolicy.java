package edu.wctc.sales.iSales;

import edu.wctc.sales.Sale;

public interface IShippingPolicy {
    void applyShipping(Sale sale);
}
