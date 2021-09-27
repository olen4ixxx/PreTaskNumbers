/* Leanid Nasanovich
 * Version info 1.0
 * Copyright notice
 */

package io.olen4ixxx.pretask.factory;

import io.olen4ixxx.pretask.entity.CustomNumber;

public class CustomNumberFactory {

    public CustomNumber createCustomNumber (double doubleNumber) {
        return new CustomNumber(doubleNumber);
    }
}
