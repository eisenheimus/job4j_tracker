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
        boolean result = index != -1;

        if (!result) {
            return false;
        }
        newItem.setId(id);
        items[index] = newItem;
        return true;
    }

    public void delete(int id) {
        int index = indexOf(id);
        boolean result = index != -1;

        if (result) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[100];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (this.items[i].getName().equals(key)) {
                result[count] = this.items[i];
                count++;
            }
        }

        return Arrays.copyOf(result, count);
    }
}