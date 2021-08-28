package week2.ex04;

public class Starbucks {
    private String branch;
    private int income;
    private int cups;
    private int customer;

    public Starbucks(String branch){
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

    public void showBucksInfo(){
        System.out.println("Starbucks " + branch + "점의 손님은 " + customer + "명이고, 수입은 " + income + "원이며, " + cups + "잔을 판매하였습니다.");
    }

}
