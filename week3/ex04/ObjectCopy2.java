package ex04;

public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];
        Book[] bookArray3 = new Book[3];
        Book[] bookArray4 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 헤세");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray3[i] = new Book();
            bookArray3[i].setAuthor(bookArray1[i].getAuthor());
            bookArray3[i].setBookName(bookArray1[i].getBookName());
        }
        for (int i = 0; i < bookArray4.length; i++) {
            bookArray4[i] = bookArray1[i].copyBook();
        }
        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");
        for(int i = 0; i<bookArray2.length; i++){
        }
        System.out.println("=== bookArray1 ===");
        for(int i = 0; i<bookArray1.length; i++){
            bookArray1[i].showBookInfo();
        }
        System.out.println("\n=== bookArray2 ===");
        for(int i=0; i<bookArray2.length; i++){
            bookArray2[i].showBookInfo();
        }
        System.out.println("\n=== bookArray3 ===");
        for(int i=0; i<bookArray3.length; i++){
            bookArray3[i].showBookInfo();
        }
        System.out.println("\n=== bookArray4 ===");
        for(int i=0; i<bookArray4.length; i++){
        bookArray4[i].showBookInfo();
        }

    }
}
