/* Leanid Nasanovich
 * Version info 1.0
 * Copyright notice
 */

package io.olen4ixxx.pretask.reader;

import io.olen4ixxx.pretask.entity.CustomNumber;
import io.olen4ixxx.pretask.entity.CustomNumberFactory;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringToCustomNumber {
    static Logger logger = LogManager.getLogger();

    public static List<CustomNumber> stringToNumbers()
            throws IOException, NumberFormatException {
        String firstNumberInString = CustomNumberFileReader.read().get(0);
        String secondNumberInString = CustomNumberFileReader.read().get(1);

        Double firstCustomNumberValue = 0.0;
        Double secondCustomNumberValue = 0.0;
        try {
            firstCustomNumberValue = Double.parseDouble(firstNumberInString);
            secondCustomNumberValue = Double.parseDouble(secondNumberInString);
        } catch (NumberFormatException e) {
            logger.log(Level.ERROR, "please, check the numbers", e);
        }
//        if (CustomNumberValidator.isNumeric(firstNumberInString)
//                && CustomNumberValidator.isNumeric(secondNumberInString)) {
//            firstCustomNumberValue = Double.parseDouble(firstNumberInString);
//            secondCustomNumberValue = Double.parseDouble(secondNumberInString);
//        } else {
//            try {
//                throw new NumberFormatException("Exception 1");
//            } catch (NumberFormatException e) {
//                logger.log(Level.ERROR, "please, check the numbers", e);
//            }
//        }

        CustomNumber firstNumber = CustomNumberFactory
                .createCustomNumber(firstCustomNumberValue);
        CustomNumber secondNumber = CustomNumberFactory
                .createCustomNumber(secondCustomNumberValue);

        List<CustomNumber> customNumbers = new ArrayList<>();
        customNumbers.add(firstNumber);
        customNumbers.add(secondNumber);

        return customNumbers;
    }
}
