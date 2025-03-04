package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        int answer = new Random().nextInt(3);
        Scanner input = new Scanner(System.in);
        String message;

        System.out.print("Я великий Оракул. Что ты хочешь узнать?\n");
        input.nextLine();
        switch (answer) {
            case 0: message = "Да";
                break;
            case 1: message = "Нет";
                break;
            default: message = "Может быть";
                break;
        }
        System.out.println(message);
    }
}
