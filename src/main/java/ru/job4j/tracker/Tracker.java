package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    private int indexOf(int id) {
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                index = i;
                break;
            }
        }

        return index;
    }

    public Item findById(int id) {
        int index = indexOf(id);

        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item newItem) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        newItem.setId(items[index].getId());
        items[index] = newItem;

        return true;
    }

    public Item[] findAll() {
        Item[] result = new Item[100];
        int size = 0;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null) {
                result[size] = this.items[i];
                size++;
            }
        }

        return Arrays.copyOf(result, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[100];
        int size = 0;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null && this.items[i].getName() == key) {
                result[size] = this.items[i];
                size++;
            }
        }

        return Arrays.copyOf(result, size);
    }
}