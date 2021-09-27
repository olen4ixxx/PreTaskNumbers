/* Leanid Nasanovich
 * Version info 1.0
 * Copyright notice
 */

package io.olen4ixxx.pretask.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CustomNumberFileReader {
    public List<String> read() throws IOException, URISyntaxException {
//        how to write the path
//        URL res = getClass().getClassLoader().getResource("numbers.txt");
        URL res = CustomNumberFileReader.class.getClassLoader().getResource("numbers.txt");
        File file = Paths.get(res.toURI()).toFile();
        String aPath = file.getPath();
        Path path = Paths.get(aPath);
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
