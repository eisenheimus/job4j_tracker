package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int num) {
        return num - x;
    }

    public int divide(int num) {
        return num / x;
    }

    public int sumAllOperation(int num) {
        return sum(num) + multiply(num) + minus(num) + divide(num);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sumResult = Calculator.sum(10);
        int minusResult = Calculator.minus(2);
        int divideResult = calc.divide(2);
        int multiplyResult = calc.multiply(6);
        int allResult =  calc.sumAllOperation(3);

        System.out.println(sumResult);
        System.out.println(minusResult);
        System.out.println(divideResult);
        System.out.println(multiplyResult);
        System.out.println(allResult);
    }
}