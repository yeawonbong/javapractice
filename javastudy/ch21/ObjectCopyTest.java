package ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5]; // 객체 배열
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        System.arraycopy(library, 0, copyLibrary, 0, library.length);

        System.out.println("== library ==");
        for (Book book : library) {
            System.out.println(book); // 객체 주소값
            book.showInfo();
        }
        System.out.println("\n== copy library ==");
        for (Book book : copyLibrary) {
            System.out.println(book); // 객체 주소값
            book.showInfo();
        }

    }
}