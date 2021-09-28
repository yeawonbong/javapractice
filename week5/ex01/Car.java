package ex01;

public abstract class Car {
    private final void startCar(){
        System.out.println("시동을 켭니다");
    }
    protected abstract void drive();

    protected void wiper(){}

    protected abstract void stop();

    private final void turnOff(){
        System.out.println("시동을 끕니다.");
    }
    public void run(){
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }
}
