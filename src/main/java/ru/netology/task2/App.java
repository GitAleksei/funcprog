package ru.netology.task2;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Cadastral assistant
 *
 */

public class App {

    private static final double BOUND_WIDTH = 20;
    private static final double BOUND_LENGTH = 50;
    private static final double BOUND_PRICE = 1_000;
    private static final double COUNT_OF_PLOTS = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену за квадратный метр: ");
        double pricePerMeterEnter = scanner.nextDouble();

        List<Plot> plots = generatePlots();

        FairDeal fairDeal = new FairDeal();

        plots.forEach(plot -> System.out.println(plot.toString() + "\nЧестная сделка: " +
                fairDeal.test(plot.getPricePerMeter(), pricePerMeterEnter)));
    }


    private static List<Plot> generatePlots() {
        List<Plot> plots = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < COUNT_OF_PLOTS; i++) {
            plots.add(
                    new Plot(random.nextDouble() * BOUND_WIDTH,
                            random.nextDouble() * BOUND_LENGTH,
                            random.nextDouble() * BOUND_PRICE));
        }

        return plots;
    }
}
