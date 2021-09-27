package io.olen4ixxx.pretask.service;

import io.olen4ixxx.pretask.entity.CustomNumber;
import io.olen4ixxx.pretask.factory.CustomNumberFactory;

public interface Operation {
    CustomNumber result(CustomNumber firstNumber, CustomNumber secondNumber);
}
