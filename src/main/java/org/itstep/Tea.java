package org.itstep;

// FIXME: реализовать интерфейс Comparable<Tea>. Метод compareTo() должен производить сравнение по цене
public class Tea implements Comparable<Tea> {
    private final String name;
    private final double price;

    public Tea(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Tea other) {
        int tmp = 2;
        if (this.price > other.price) {
            tmp = 1;
        } else {
            if (this.price == other.price) {
                tmp = 0;
            } else {
                if (this.price < other.price) {
                    tmp = -1;
                }
            }
        }
        return tmp;
    }

    @Override
    public String toString() {
        return "Tea: " + name + " | Price: " + price;
    }
}