package week2.ex02;

public class This {
    //자기 자신의 인스턴스 주소를 가리키는 this
    //생성자에서 다른 생성자를 호출하는 this
    //자기 자신을 반환하는 this
    //예제코드
    //#this #생성자에서 this 사용할 때 주의 할 점 #this출력해보기
//    public This(){
//        this("");

    public boolean test;

    public This(){
        this(true);
    }
    public This(boolean test){
        this.test = test;
        System.out.println("moderate in moderator :   " + test);
    }

    public void printThis() {
        System.out.println("address of this instance :   " + this);
    }
}

//생성자에서 this로 생성할 일이 뭐가 있을까? 예제
