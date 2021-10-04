package ex03;
import java.util.ArrayList;

public class CustomerListTest {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<>();
        Customer sLee = new Customer(1001, "이순신");
        Customer sSim = new Customer(1002, "심사임당");
        Customer gHong = new GoldCustomer(1003, "홍길동");
        Customer uLee = new GoldCustomer(1004, "이율곡");
        Customer uKim = new VIPCustomer(1005 , "김유신", 12345);

        customerList.add(sLee);
        customerList.add(sSim);
        customerList.add(gHong);
        customerList.add(uLee);
        customerList.add(uKim);

        System.out.println("====== 고객 정보 출력 =======");
        for(Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("====== 할인율과 보너스 포인트 계산 =======");
        for(Customer customer : customerList){
            System.out.println(customer.customerName + " 님이 "+ customer.calcPrice (10000) +"원 지불하셨습니다.");
            System.out.println(customer.customerName + " 님의 현재 보너스 포인트는 " +  customer.bonusPoint+ "점입니다.");
        }
    }
}