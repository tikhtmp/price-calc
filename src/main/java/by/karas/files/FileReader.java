package by.karas.files;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

public interface FileReader {
    Map<Integer, BigDecimal> readData(String filePath) throws IOException;
}
