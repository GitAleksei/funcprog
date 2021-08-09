package ru.netology.task2;

import java.util.function.BinaryOperator;

public class PricePerMeterCalculate implements BinaryOperator<Double> {

    @Override
    public Double apply(Double meters, Double price) {
        return price / meters;
    }
}
