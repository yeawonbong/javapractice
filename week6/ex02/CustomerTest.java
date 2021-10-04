package ex02;

public class CustomerTest {
    public static void main(String[] args) {
//        Customer customer = new Customer();
//        ((Buy)customer).buy();

        Buy buy = new Customer();
        buy.order();
        buy.buy();
//        buy.sell();
        Sell sell = new Customer();
        sell.order();
//        sell.buy();
        sell.sell();
    }
}