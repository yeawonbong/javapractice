package study_2.ex03;

public class CoffeeBean {
    private String branch;
    private int income;
    private int cups;
    private int customer;

    public CoffeeBean(String branch){
        this.branch = branch;
    }
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public void showBeanInfo(){
        System.out.println("CoffeeBean " + branch + "점의 손님은 " + customer + "명이고, 수입은 " + income + "원이며, "
                + cups + "잔을 판매하였습니다.");
    }
}
