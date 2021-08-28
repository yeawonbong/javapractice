package study_2.ex03;
public class Bus {
    private int busNum;
    private int passenger;
    private int income;

    public Bus(int busNum) {
        setBusNum(busNum);
    }
    public int getBusNum() {
        return busNum;
    }

    public void setBusNum(int busNum) {
        this.busNum = busNum;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void showBusInfo(){
        System.out.println(busNum + "번 " + "버스의 승객은 " + passenger +"명 이고, 수입은 " + income + "원 입니다");
    }
}
