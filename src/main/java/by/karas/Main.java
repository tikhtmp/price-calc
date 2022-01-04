package by.karas;

import by.karas.files.FileReader;
import by.karas.model.ReadData;
import by.karas.model.Status;
import by.karas.model.StatusType;
import by.karas.selector.PriceSelector;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //File for prices
        // Change calc function
        // Change user dialogs

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        FileReader fileReader = applicationContext.getBean(FileReader.class);
        PriceSelector priceSelector =applicationContext.getBean(PriceSelector.class);

        Scanner scanner = new Scanner(System.in);
        Status currentStatus = new ReadData(priceSelector, fileReader, scanner);

        while (currentStatus.getType() != StatusType.EXIT){
            currentStatus = currentStatus.handle();
        }
    }
}
