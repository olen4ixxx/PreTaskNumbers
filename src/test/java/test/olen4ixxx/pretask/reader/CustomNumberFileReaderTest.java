package test.olen4ixxx.pretask.reader;

import io.olen4ixxx.pretask.reader.CustomNumberFileReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.testng.Assert.*;

public class CustomNumberFileReaderTest {

    @Test(enabled = false)
    public void testRead() throws IOException, URISyntaxException {
        CustomNumberFileReader customNumberFileReader = new CustomNumberFileReader();
        Assert.assertNotNull(customNumberFileReader.read());
    }
}