package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
        String result = "Колобок сбежал";
        if (condition) {
            result = "колобок съеден!";
        }
        System.out.println(result);
    }
}
