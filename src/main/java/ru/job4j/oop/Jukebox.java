package ru.job4j.oop;

public class Jukebox {
    public void position(int position) {
        String song = "";
        switch (position) {
            case 1: song = "Пусть бегут неулюже пешеходы по лучжам...";
                break;
            case 2: song = "Спят усталые игрушки, книжки спят...";
                break;
            default: song = "Песня не найдена!";
                break;
        }
        System.out.println(song);
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.position(1);
        jukebox.position(2);
        jukebox.position(3);
    }
}
