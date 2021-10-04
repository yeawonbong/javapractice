package ex04;

import java.util.ArrayList;

public class BookShelf extends Shelf implements Queue {


    @Override
    public String deQueue() {
        if (shelf.size() > 0)
            return shelf.remove(0);
        else
            return null;
    }

    @Override
    public void enQueue(String input) {
        shelf.add(input);
    }

    public static void test() {
        System.out.println("test bookshelf");
    }
}
