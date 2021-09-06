package ex02;

public class Company {
    private static final Company instance = new Company();
    private Company(){}
    public static Company getInstance() {
        return instance;
    }
}
