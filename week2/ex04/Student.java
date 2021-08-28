package week2.ex04;

public class Student {
    private String name;
    private int money;

    public Student(String name, int money){
        this.setName(name);
        this.setMoney(money);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void takeBus(Bus bus){
        this.money -= 1000;
        bus.setIncome(bus.getIncome() + 1000);
        bus.setPassenger(bus.getPassenger() + 1);
    }

    public void takeSubway(Subway subway){
        this.money -= 1200;
        subway.setIncome(subway.getIncome() + 1200);
        subway.setPassenger(subway.getPassenger() + 1);
    }

    public void showInfo(){
        System.out.println(name + "님은 남은 돈은" + money + "원 입니다");
    }

    public void takeStarbucks(Starbucks bucks, String menu){
        int cost = 0;

        switch (menu){
            case "Americano" :
                cost = 3000;
                break;
            case "Latte" :
                cost = 4000;
        }
        this.money -= cost;
        bucks.setIncome(bucks.getIncome() + cost);
        bucks.setCups(bucks.getCups() + 1);
        bucks.setCustomer(bucks.getCustomer() + 1);
    }
    public void takeCoffeeBean(CoffeeBean bean, String menu){
        int cost = 0;

        switch (menu){
            case "Americano" :
                cost = 3000;

            case "Latte" :
                cost = 4000;
        }
        this.money -= cost;
        bean.setIncome(bean.getIncome() + cost);
        bean.setCups(bean.getCups() + 1);
        bean.setCustomer(bean.getCustomer() + 1);
    }
}
