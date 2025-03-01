package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Obi Wan Kenobi");
        student.setGroup("Jedi-group");
        student.setDate("75 BBY");

        System.out.println("Имя: " + student.getName() + ", группа: " + student.getGroup() + ", дата: " + student.getDate());
    }
}
