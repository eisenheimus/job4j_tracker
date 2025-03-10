package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Автобус движется");
    }

    @Override
    public void passenger(int count) {
        System.out.printf("Теущий рейс %s пасажиров", count);
    }

    @Override
    public int refuel(int fuel) {
        int price = 55;
        return fuel * price;
    }
}
