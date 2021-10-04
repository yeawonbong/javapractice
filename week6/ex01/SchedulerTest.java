package ex01;

import java.awt.geom.RoundRectangle2D;
import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식을 선택 하세요.");

        System.out.println("R : 한명씩 차례로 할당");
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P : 우선순위가 높은 고객 먼저 할당");

        char ch = (char)System.in.read();
        Scheduler ref = null;

        switch (ch) {
            case 'R','r':
                ref = new RoundRobin();
                break;
            case 'L','l':
                ref = new LeastJob();
                break;
            case 'P','p':
                ref = new PriorityAllocation();
                break;
            default:
                break;
        }
        if (ref == null) {
            System.out.println("Error: not a valid input");
        }
        else {
            ref.getNextCall();
            ref.sendCallToAgent();
        }
    }
}