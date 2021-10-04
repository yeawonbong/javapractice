package ex02;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("Customer buys.");
    }

    @Override
    public void sell() {
        System.out.println("Customer sells.");
    }

    @Override
    public void order() {
        System.out.println("고객 구매 주문");
    }

}
