/* Leanid Nasanovich
 * Version info 1.0
 * Copyright notice
 */

package io.olen4ixxx.pretask;

import io.olen4ixxx.pretask.entity.CustomNumberCalculation;
import io.olen4ixxx.pretask.entity.OperationType;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class LogMain {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws IOException {
        String additionMsg = "addition: "
                + String.valueOf(CustomNumberCalculation.calculate(OperationType.ADDITION).getValue());
        String divisionMsg = "division: "
                + String.valueOf(CustomNumberCalculation.calculate(OperationType.DIVISION).getValue());
        String multiplicationMsg = "multiplication: "
                + String.valueOf(CustomNumberCalculation.calculate(OperationType.MULTIPLICATION).getValue());
        String subtractionMsg = "subtraction: "
                + String.valueOf(CustomNumberCalculation.calculate(OperationType.SUBTRACTION).getValue());

        logger.log(Level.INFO, additionMsg);
        logger.log(Level.INFO, divisionMsg);
        logger.log(Level.INFO, multiplicationMsg);
        logger.log(Level.INFO, subtractionMsg);

    }
}
