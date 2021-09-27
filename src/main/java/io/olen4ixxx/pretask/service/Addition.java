/* Leanid Nasanovich
 * Version info 1.0
 * Copyright notice
 */

package io.olen4ixxx.pretask.service;

import io.olen4ixxx.pretask.entity.CustomNumber;
import io.olen4ixxx.pretask.entity.CustomNumberFactory;

public class Addition {
    public static CustomNumber result(CustomNumber firstNumber,
                                      CustomNumber secondNumber) {
        CustomNumber result = CustomNumberFactory.createCustomNumber(0.0);
        result.setValue(firstNumber.getValue() + secondNumber.getValue());
        return result;
    }
}
