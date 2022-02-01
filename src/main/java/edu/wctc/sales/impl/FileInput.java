package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iSales.SalesInput;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class FileInput implements SalesInput {

    @Override
    public List<Sale> getSales() {
        List<String> contents = readline();
        List<Sale> sales = new ArrayList<>();

        for(String row : contents) {
            String[] array = row.split(",");
            Sale sale = new Sale(array);
            sales.add(sale);
        }

        return sales;
    }

    public List<String> readline() {

        File data = new File("E:\\Spring 2022\\Distributed Java\\src\\main\\java\\edu\\wctc\\sales\\sales.txt");

        BufferedReader in = null;
        String line = null;
        List<String> contents = new ArrayList<>();

        try {
            if (data.exists()) {
                // make sure we differentiate between java.io.FileReader
                // class and this class (also called FileReader)
                in = new BufferedReader(new java.io.FileReader(data));

                while (true) {
                    line = in.readLine();
                    if (line == null) {
                        break;
                    }
                    contents.add(line);
                }
                in.close();
            } else {
                System.out.println("File not found - data.txt");
                line = null;
            }
        } catch (IOException ioe) {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ioe2) {
                System.out.println(ioe2.getMessage());
            }
            System.out.println(ioe.getMessage());
            System.exit(1);  // 1 = signals program end with error
        }

        return contents;
    }
}