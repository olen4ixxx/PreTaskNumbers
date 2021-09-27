package test.olen4ixxx.pretask.service;

import io.olen4ixxx.pretask.entity.CustomNumber;
import io.olen4ixxx.pretask.service.Addition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AdditionTest {

    @Test
    public void testResult() {
        CustomNumber firstNumber = new CustomNumber(10.0);
        CustomNumber secondNumber = new CustomNumber(20.0);

        double actual = Addition.result(firstNumber, secondNumber).getValue();
        double expected = 30.5;

        assertEquals(actual, expected, 0.1, "Test failed since sum is wrong");
    }
}