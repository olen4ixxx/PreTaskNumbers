/* Leanid Nasanovich
 * Version info 1.0
 * Copyright notice
 */

package io.olen4ixxx.pretask.entity;

import io.olen4ixxx.pretask.reader.CustomNumberFileReader;
import io.olen4ixxx.pretask.reader.StringToCustomNumber;
import io.olen4ixxx.pretask.service.Addition;
import io.olen4ixxx.pretask.service.Division;
import io.olen4ixxx.pretask.service.Multiplication;
import io.olen4ixxx.pretask.service.Subtraction;

import java.io.IOException;

public class CustomNumberCalculation {
    public static CustomNumber calculate (OperationType operationType) throws IOException {
        CustomNumber customNumber = null;
        switch(operationType) {
        case ADDITION:
            return Addition.result(StringToCustomNumber.stringToNumbers().
                        get(0),StringToCustomNumber.stringToNumbers().get(1));
        case DIVISION:
            return Division.result(StringToCustomNumber.stringToNumbers().
                        get(0),StringToCustomNumber.stringToNumbers().get(1));
        case MULTIPLICATION:
            return Multiplication.result(StringToCustomNumber.stringToNumbers().
                        get(0),StringToCustomNumber.stringToNumbers().get(1));
        case SUBTRACTION:
            return Subtraction.result(StringToCustomNumber.stringToNumbers().
                        get(0),StringToCustomNumber.stringToNumbers().get(1));
        default:
            return new CustomNumber();
        }
    }
}
