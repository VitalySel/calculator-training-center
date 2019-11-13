package com.seliverstov.calculator.operations;

public class Addition implements Operation {
    private Integer priority;

    public Addition(Integer priority) {
        this.priority = priority;
    }

    @Override
    public Integer getPriority() {
        return priority;
    }

    @Override
    public double result(double b, double a) {
        return b+a;
    }
}
