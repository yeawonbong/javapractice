package ex04;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();
//        shelfQueue.deQueue();
        shelfQueue.enQueue("태백산맥 1");
        shelfQueue.enQueue("태백산맥 2");
        shelfQueue.enQueue("태백산맥 3");
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());

        Queue.test();
        BookShelf shelf = (BookShelf)shelfQueue;
        shelf.test();
        BookShelf.test();

        shelfQueue.test2();
        Queue.test3();
    }
}
