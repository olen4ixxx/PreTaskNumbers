/* Leanid Nasanovich
 * Version info 1.0
 * Copyright notice
 */

package io.olen4ixxx.pretask.mapper;

import io.olen4ixxx.pretask.entity.CustomNumber;
import io.olen4ixxx.pretask.factory.CustomNumberFactory;
import io.olen4ixxx.pretask.reader.CustomNumberFileReader;
import io.olen4ixxx.pretask.validation.CustomNumberValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class StringToCustomNumberMapper {
    static Logger logger = LogManager.getLogger();

    public static List<CustomNumber> stringToNumbers()
            throws IOException, URISyntaxException {
        CustomNumberFileReader reader = new CustomNumberFileReader();

        List<String> numbersList = reader.read();

        String firstNumberInString = numbersList.get(0);
        String secondNumberInString = numbersList.get(1);

        double firstCustomNumberValue = 0.0;
        double secondCustomNumberValue = 0.0;
        try {
            firstCustomNumberValue = CustomNumberValidator.parseNumeric(firstNumberInString);
            secondCustomNumberValue = CustomNumberValidator.parseNumeric(secondNumberInString);
            CustomNumberValidator.zeroDivision(secondNumberInString);
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
        CustomNumberFactory factory = new CustomNumberFactory();

        CustomNumber firstNumber = factory
                .createCustomNumber(firstCustomNumberValue);
        CustomNumber secondNumber = factory
                .createCustomNumber(secondCustomNumberValue);

        List<CustomNumber> customNumbers = new ArrayList<>();
        customNumbers.add(firstNumber);
        customNumbers.add(secondNumber);

        return customNumbers;
    }
}
