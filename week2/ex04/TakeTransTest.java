package week2.ex04;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);

        Subway subwayGreen = new Subway(2);

        studentJ.takeBus(bus100);
        studentT.takeSubway(subwayGreen);

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusInfo();

        subwayGreen.showSubwayInfo();

        Starbucks bucks = new Starbucks("Gangnam");
        CoffeeBean bean = new CoffeeBean("Gaepo");

        studentJ.takeStarbucks(bucks, "Americano");
        studentT.takeCoffeeBean(bean, "Latte");

        studentJ.showInfo();
        studentT.showInfo();

        bucks.showBucksInfo();
        bean.showBeanInfo();

    }
}
