package ex02;

final class AdvancedLevel extends PlayerLevel{

    @Override
    protected void showLevelMessage() {
        System.out.println("***** 중급자 레벨 입니다. *****");
    }

    @Override
    protected void run() {
        System.out.println("빨리 달립니다");
    }

    @Override
    protected void jump() {
        System.out.println("높이 jump 합니다.");
    }

    @Override
    protected void turn() {
        System.out.println("Turn 할 줄 모르지롱");
    }

}
