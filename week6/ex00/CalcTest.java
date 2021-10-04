package ex00;

public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calculator();

        int a = 1514;
//        int b = 32424;
        int b = 0;
        System.out.println("a + b = "+calc.add(a, b));
        System.out.println("a - b = "+calc.subtract(a, b));
        System.out.println("a * b = "+calc.times(a, b));
        System.out.println("a / b = "+calc.divide(a, b));
//
//        Calculator calc2 = new Calculator();
//        System.out.println("Calc.pi = "+calc.PI);
//        System.out.println("Calculator.pi = "+calc2.PI);
    }
}
