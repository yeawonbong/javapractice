package week2.ex01;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(31, 6, 2020);
        System.out.println(date1.isValid());
        MyDate date2 = new MyDate(2, 9, 2006);
        System.out.println(date2.isValid());

    //date1.day =10;   //에러
    // date1.month = 3;
    // date1.year = 2020;
    }
}
