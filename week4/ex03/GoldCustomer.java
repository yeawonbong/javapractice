package ex03;

public class GoldCustomer extends Customer {
    double discountRate;

    public GoldCustomer(int customerId, String customerName){
        super(customerId, customerName);
        customerGrade = "GOLD";
        bonusRate = 0.02;
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