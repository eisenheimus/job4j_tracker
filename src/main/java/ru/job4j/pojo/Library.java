package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", 500);
        Book book2 = new Book("20000 лье под водой", 500);
        Book book3 = new Book("Пикнин на обочине", 300);
        Book book4 = new Book("Клуб самоубийц", 250);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + ", " + books[i].getPageCount() + " стр.");
        }

        Book tmp = books[3];
        books[3] = books[0];
        books[0] = tmp;

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean Code")) {
                System.out.println(books[i].getName() + ", " + books[i].getPageCount() + " стр.");
            }
        }
    }
}
