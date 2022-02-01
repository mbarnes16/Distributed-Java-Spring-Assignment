package edu.wctc.sales;

//import edu.wctc.dice.iface.GameInput;
//import edu.wctc.dice.iface.GameOutput;
//import edu.wctc.dice.iface.IDice;
//import edu.wctc.dice.impl.Dice20;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;

import edu.wctc.sales.impl.DetailReport;
import edu.wctc.sales.iSales.IShippingPolicy;
import edu.wctc.sales.iSales.SalesInput;
import edu.wctc.sales.iSales.SalesReport;
import edu.wctc.sales.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.sales")

public class AppConfig {
    @Bean
    public SalesInput salesInput() {
        //return new ConsoleInput();
        return new FileInput();
    }

    @Bean
    public SalesReport salesReport() {
        return new DetailReport();
        //return new SummaryReport();
    }

    @Bean
    public IShippingPolicy ishippingPolicy() {
        return new FreeShipping();
        // return new FlatRateShipping();
        // return new FreeShippingOverX();
    }
}


