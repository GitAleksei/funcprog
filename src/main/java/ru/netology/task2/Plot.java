package ru.netology.task2;

public class Plot {
    private final double width;
    private final double length;
    private final double price;

    public Plot(double width, double length, double price) {
        this.width = width;
        this.length = length;
        this.price = price;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getPrice() {
        return price;
    }

    public double getSquare() {
        Square square = new Square();
        return square.apply(getWidth(), getLength());
    }

    public double getPricePerMeter() {
        PricePerMeterCalculate pricePerMeterCalculate = new PricePerMeterCalculate();
        return pricePerMeterCalculate.apply(getSquare(), getPrice());
    }

    @Override
    public String toString() {
        return String.format("%s%6.2f%s%6.2f%s%7.2f%s%7.2f", "Ширина: ", width, ", длина: ", length,
                ", цена: ", price, ", цена за метр: ", getPricePerMeter());
    }
}
