package week2.ex04;

public class Subway {
    private int subwayNum;
    private int passenger;
    private int income;

    public Subway(int subwayNum) {
        setSubwayNum(subwayNum);
    }
    public int getSubwayNum() {
        return subwayNum;
    }

    public void setSubwayNum(int subwayNum) {
        this.subwayNum = subwayNum;
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

    public void showSubwayInfo(){
        System.out.println(subwayNum + "번 " + "지하철의 승객은 " + passenger +"명 이고, 수입은 " + income + "원 입니다");
    }
}
