package ex03;

public class Customer {
    protected int bonusPoint;
    protected double bonusRate;
    protected String customerName;
    protected String customerGrade;
    protected int customerId;


    public Customer(){
    }
    public Customer(int customerId, String customerName){
        this.customerId = customerId;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRate = 0.01;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int calcPrice(int price){
        bonusPoint += (price * bonusRate);
        return price;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다";
    }
}
