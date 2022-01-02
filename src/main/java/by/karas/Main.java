package by.karas;

import by.karas.files.CSVFileReader;
import by.karas.files.FileReader;
import by.karas.model.ReadData;
import by.karas.model.Status;
import by.karas.model.StatusType;
import by.karas.selector.PriceSelector;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //File for prices
        // Change calc function
        // Change user dialogs


        PriceSelector priceSelector = new PriceSelector();
        Scanner scanner = new Scanner(System.in);
        Status currentStatus = new ReadData();

        while (currentStatus.getType() != StatusType.EXIT){
            currentStatus = currentStatus.handle(scanner);
        }
    }
}
