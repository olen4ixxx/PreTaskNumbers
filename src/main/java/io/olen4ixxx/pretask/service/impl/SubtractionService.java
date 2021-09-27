/* Leanid Nasanovich
 * Version info 1.0
 * Copyright notice
 */

package io.olen4ixxx.pretask.service.impl;

import io.olen4ixxx.pretask.entity.CustomNumber;
import io.olen4ixxx.pretask.factory.CustomNumberFactory;
import io.olen4ixxx.pretask.service.Operation;

public class SubtractionService implements Operation {
    public CustomNumber result(CustomNumber firstNumber, CustomNumber secondNumber) {
        CustomNumberFactory factory = new CustomNumberFactory();
        return factory.createCustomNumber(firstNumber.getValue() - secondNumber.getValue());
    }
}
