package ru.job4j.polymorphism;

public interface Transport {
    void move();

    void passenger(int count);

    int refuel(int fuel);
}
