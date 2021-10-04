package ex01;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("먼저 들어오는 전화부터 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("가장 짧은 대기열을 보유한 상담원에게 배분합니다.");
    }
}
