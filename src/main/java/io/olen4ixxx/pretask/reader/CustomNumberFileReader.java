/* Leanid Nasanovich
 * Version info 1.0
 * Copyright notice
 */

package io.olen4ixxx.pretask.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomNumberFileReader {
    public static List<String> read() throws IOException {
//        how to write the path
        Path path = Paths.get("src\\main\\resources\\numbers.txt");
//        Charset charset = Charset.forName("ISO-8859-1");

        List<String> linesList = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            for (int i = 0; i < 2; i++) {
                linesList.add(i, reader.readLine());
            }
        }

        return linesList;
    }
}
