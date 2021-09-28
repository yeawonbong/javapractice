package ex01;

public class AICar extends Car{
    @Override
    protected void drive() {
        System.out.println("자율 주행 합니다\n자동차가 스스로 방향을 전환합니다");
    }

    @Override
    protected void wiper() {
        System.out.println("비나 눈의 양에 따라 빠르기가 자동으로 조절됩니다");
    }

    @Override
    protected void stop() {
        System.out.println("스스로 멈춥니다.");
    }
}
