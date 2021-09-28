package ex01;

public class VIPCustomer extends Customer {
    double discountRate;
    int apple;
    //int agentID;

    public VIPCustomer(int customerId, String customerName){
        super(customerId, customerName);
        //this.agentID = agentID;
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
    public int calcPrice(int price){
        bonusPoint += (price * bonusRate);
        return price - (int) (price * discountRate);
    }
}