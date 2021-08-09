package ru.netology.task2;

import java.util.function.BiPredicate;

public class FairDeal implements BiPredicate<Double, Double> {

    @Override
    public boolean test(Double pricePerMeterCalculate, Double pricePerMeterEnter) {
        return pricePerMeterCalculate >= pricePerMeterEnter;
    }
}
