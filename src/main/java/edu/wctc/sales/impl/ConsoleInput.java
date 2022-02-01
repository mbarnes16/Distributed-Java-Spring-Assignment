package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iSales.SalesInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements SalesInput {
    private Scanner scanner = new Scanner(System.in);

//
//    @Override
//    public String getInput(String prompt) {
//        System.out.print(prompt);
//        return scanner.nextLine();
//    }

    @Override
    public List<Sale> getSales() {
        String line = "";
        List<Sale> salesList = new ArrayList<>();

        while(!line.equalsIgnoreCase("q")) {
            System.out.println("Enter sales information as customer name, country, amount, tax; Enter q to quit");
            line = scanner.nextLine();

            String array[] = line.split(",");
            Sale sale = new Sale(array);
            salesList.add(sale);
        }

        return salesList;
    }
}