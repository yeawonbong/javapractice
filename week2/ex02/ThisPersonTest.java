package week2.ex02;

public class ThisPersonTest {
    public static void main(String[] args){

        ThisPerson personKim = new ThisPerson("김땡땡", 30);
        personKim.printInfo();

        ThisPerson personHong = new ThisPerson("홍길동", "010-1234-5678");
        personHong.printInfo();

        personHong.printThis();
        System.out.println("address of Hong instance :   " + personHong);
        personKim.printThis();
        System.out.println("address of Kim  instance :   " + personKim);

    }
}
