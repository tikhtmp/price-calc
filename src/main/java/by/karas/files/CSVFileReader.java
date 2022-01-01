package by.karas.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CSVFileReader implements FileReader{

    @Override
    public Map<Integer, BigDecimal> readData(String filePath) throws IOException {
        Map<Integer, BigDecimal> resultMap = new TreeMap<>();
        InputStream inputStream = getClass().getResourceAsStream("/" + filePath);
        try (InputStreamReader inputStreamReader = new InputStreamReader(inputStream);){
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            String[] values;

            while ((line = bufferedReader.readLine()) != null){
                values = line.split(",");
                resultMap.put(Integer.valueOf(values[0]), new BigDecimal(values[1]));

            }
        }
        return resultMap;
    }
//    @Override
//    public Map<Integer, BigDecimal> readData(String filePath) throws IOException {
    //TODO: change String to BigDecimal
//        Map<String, String> result = Files.lines(Paths.get(filePath))
//                .map(s -> s.split(",")).collect(Collectors.toMap(s -> s[0], s-> s[1]));
//        result.entrySet().stream().forEach(System.out::println);
//        return null;

//    }
}
