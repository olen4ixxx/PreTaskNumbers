/* Leanid Nasanovich
 * Version info 1.0
 * Copyright notice
 */

package io.olen4ixxx.pretask.entity;

public class CustomNumber {
    private Double value;

    public CustomNumber() {
//        this.value = 0;
    }

    public CustomNumber(Double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
