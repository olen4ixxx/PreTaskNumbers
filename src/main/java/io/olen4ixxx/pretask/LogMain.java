/* Leanid Nasanovich
 * Version info 1.0
 * Copyright notice
 */

package io.olen4ixxx.pretask;

import io.olen4ixxx.pretask.exception.CustomNumberException;
import io.olen4ixxx.pretask.service.impl.CustomNumberCalculationService;
import io.olen4ixxx.pretask.entity.OperationType;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.URISyntaxException;

public class LogMain {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        CustomNumberCalculationService customNumberCalculationService
                = new CustomNumberCalculationService();

        String additionMsg = "";
        String divisionMsg = "";
        String multiplicationMsg = "";
        String subtractionMsg = "";

        try {
            additionMsg = "addition: "
                    + customNumberCalculationService.calculate(OperationType.ADDITION).getValue();
            divisionMsg = "division: "
                    + customNumberCalculationService.calculate(OperationType.DIVISION).getValue();
            multiplicationMsg = "multiplication: "
                    + customNumberCalculationService.calculate(OperationType.MULTIPLICATION).getValue();
            subtractionMsg = "subtraction: "
                    + customNumberCalculationService.calculate(OperationType.SUBTRACTION).getValue();
        } catch (CustomNumberException e) {
            logger.error(e.getMessage(), e);
        } catch (URISyntaxException e) {
            logger.error("incorrect file path", e);
        } catch (Exception e) {
            logger.error("critical error", e);
        }

        logger.info(additionMsg);
        logger.info(divisionMsg);
        logger.info(multiplicationMsg);
        logger.info(subtractionMsg);
    }
}
