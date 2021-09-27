package test.olen4ixxx.pretask.service;

import io.olen4ixxx.pretask.entity.CustomNumber;
import io.olen4ixxx.pretask.service.Operation;
import io.olen4ixxx.pretask.service.impl.AdditionService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AdditionServiceTest {

    @Test
    public void testResult() {
        CustomNumber firstNumber = new CustomNumber(10.0);
        CustomNumber secondNumber = new CustomNumber(20.0);

        Operation additionService = new AdditionService();

        double actual = additionService.result(firstNumber, secondNumber).getValue();
        double expected = 30.0;

        assertEquals(actual, expected, 0.1, "Test failed since sum is wrong");
    }
}