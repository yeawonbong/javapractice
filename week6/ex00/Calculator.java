package ex00;

public class Calculator implements Calc {
//    double PI = 1.22;

    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public int times(int num1, int num2) {
        return num1 * num2;
    }
    public int divide(int num1, int num2) {
        int ret;
        try {
            ret = num1 / num2;
        } catch (ArithmeticException e) {
            ret = ERROR;
        }
        return ret;
    }
}
