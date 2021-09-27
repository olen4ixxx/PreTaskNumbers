/* Leanid Nasanovich
 * Version info 1.0
 * Copyright notice
 */

package io.olen4ixxx.pretask.entity;

public class CustomNumberFactory {

    public static CustomNumber createCustomNumber (Double doubleNumber) {
        CustomNumber customNumber = new CustomNumber(doubleNumber);
        return customNumber;
    }
}
