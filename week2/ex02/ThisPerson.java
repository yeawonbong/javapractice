package week2.ex02;

public class ThisPerson {
    private String name;
    private int age;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ThisPerson(String name){
        this(name, 0, "NULL");
    }
    public ThisPerson(String name, int age) {
        this(name, age, "NULL");
    }
    public ThisPerson(String name, String number) {
//        this.setName("test"); //- 오류 (this() statement 이전에 다른 statement 를 쓸 수 없다) 주의할점
        this(name, 0, number);
    }
    public ThisPerson(String name, int age, String number) {
        this.setName(name);
        this.setAge(age);
        this.setNumber(number);
    }
    public void printInfo(){
        System.out.println("==========PRINT_INFO==========");
        System.out.println("이름 :  " + this.getName());
        System.out.println("나이 :  " + this.getAge());
        System.out.println("번호 :  " + this.getNumber());
        System.out.println("==============================\n");

    }
    public void printThis() {
        System.out.println("address of this instance :   " + this + " (" + this.name + "'s)");
    }
}
