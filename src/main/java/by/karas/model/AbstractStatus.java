package by.karas.model;

import by.karas.files.CSVFileReader;
import by.karas.files.FileReader;
import by.karas.selector.PriceSelector;

import java.util.Scanner;

abstract class AbstractStatus implements Status{
    PriceSelector priceSelector = new PriceSelector();
    FileReader fileReader = new CSVFileReader();
    Scanner scanner;

    public AbstractStatus(PriceSelector priceSelector, FileReader fileReader, Scanner scanner) {
        this.priceSelector = priceSelector;
        this.fileReader = fileReader;
        this.scanner = scanner;
    }
}
