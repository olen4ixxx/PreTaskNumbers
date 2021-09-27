/* Leanid Nasanovich
 * Version info 1.0
 * Copyright notice
 */

package io.olen4ixxx.pretask.service.impl;

import io.olen4ixxx.pretask.entity.CustomNumber;
import io.olen4ixxx.pretask.entity.OperationType;
import io.olen4ixxx.pretask.exception.CustomNumberException;
import io.olen4ixxx.pretask.mapper.StringToCustomNumberMapper;
import io.olen4ixxx.pretask.service.Operation;

import java.util.List;

public class CustomNumberCalculationService {
    public CustomNumber calculate (OperationType operationType) throws Exception {
        List<CustomNumber> customNumbers = StringToCustomNumberMapper.stringToNumbers();
        Operation additionService = new AdditionService();
        Operation divisionService = new DivisionService();
        Operation multiplicationService = new MultiplicationService();
        Operation subtractionService = new SubtractionService();

        switch(operationType) {
        case ADDITION:
            return additionService.result(customNumbers.get(0),customNumbers.get(1));
        case DIVISION:
            return divisionService.result(customNumbers.get(0),customNumbers.get(1));
        case MULTIPLICATION:
            return multiplicationService.result(customNumbers.get(0),customNumbers.get(1));
        case SUBTRACTION:
            return subtractionService.result(customNumbers.get(0),customNumbers.get(1));
        default:
            throw new CustomNumberException("Incorrect operation type");
        }
    }
}
