/* Leanid Nasanovich
 * Version info 1.0
 * Copyright notice
 */

package io.olen4ixxx.pretask.validation;

import java.io.IOException;

public class CustomNumberValidator {

    public static double parseNumeric(String str) throws NumberFormatException {
        if (str == null) {
            throw new NumberFormatException("please, check the numbers");
        }
        try {
            return Double.parseDouble(str);
        } catch(NumberFormatException e){
            throw new NumberFormatException("please, check the numbers");
        }
    }

    public static void zeroDivision (String str) throws IOException {
        if (Double.parseDouble(str) < 0.0000001) {
            throw new NumberFormatException("division by 0");
        }
    }

}
