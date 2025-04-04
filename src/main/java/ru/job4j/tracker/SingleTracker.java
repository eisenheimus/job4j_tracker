package ru.job4j.tracker;

public final class SingleTracker {
    private Tracker tracker = new Tracker();
    private static SingleTracker instance = null;

    private SingleTracker() { }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }

        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public boolean replace(int id, Item newItem) {
        return tracker.replace(id, newItem);
    }

    public void delete(int id) {
        tracker.delete(id);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }
}