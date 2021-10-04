package ex01;

public class RoundRobin implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("먼저 들어오는 전화부터 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("동일한 상담건수를 처리하게 하기 위해 현재 상담건수가 가장 적은 상담원에게 우선적으로 배분합니다.");
    }
}
