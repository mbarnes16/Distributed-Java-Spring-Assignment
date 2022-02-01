package edu.wctc.sales;

import edu.wctc.sales.iSales.IShippingPolicy;
import edu.wctc.sales.iSales.SalesInput;
import edu.wctc.sales.iSales.SalesReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GenerateReport {

    private SalesInput in;
    private SalesReport report;
    private IShippingPolicy ship;

    @Autowired
    public GenerateReport(SalesInput in, SalesReport report, IShippingPolicy ship){
        this.in = in;
        this.report = report;
        this.ship = ship;
    }
  public void generateReport(){
        List<Sale> allSales = in.getSales();
        for(Sale aSale : allSales)
            ship.applyShipping(aSale);
        report.generateReport(allSales);
  }
}
