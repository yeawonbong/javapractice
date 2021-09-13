package ex03;

public class VIPCustomer extends Customer {
    double discountRate;
    int agentID;

    public VIPCustomer(int customerId, String customerName, int agentID){
        super(customerId, customerName);
        this.agentID = agentID;
        customerGrade = "VIP";
        bonusRate = 0.05;
        discountRate = 0.1;
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

    @Override
    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade +"이며, 보너스 포인트는 " + bonusPoint + "입니다. 담당 상담원 번호는 " + agentID + "입니다.";
    }

    @Override
    public int calcPrice(int price){
        bonusPoint += (price * bonusRate);
        return price - (int) (price * discountRate);
    }
}