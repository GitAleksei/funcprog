package ru.netology.task2;

import java.util.function.BinaryOperator;

public class Square implements BinaryOperator<Double> {
    @Override
    public Double apply(Double width, Double length) {
        return width * length;
    }
}
