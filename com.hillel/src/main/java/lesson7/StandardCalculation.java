package lesson7;

public class StandardCalculation {
    public void description() {
        System.out.println("Стандартный калькулятор имеет функции");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        System.out.println("...");
        System.out.println("...");
        System.out.println("etc");
    }

    public int plus(int a, int b) {
        System.out.println("Standard calc plus");
        int result = a + b;
        return result;
    }

    public double plus(double a, double b) {
        System.out.println("Standard calc plus @Overloading");
        double result = a + b;
        return result;
    }

    public void minus(int a, int b) {
        System.out.println("Standard calc minus");
    }

    public void minus(double a, double b) {
        System.out.println("Standard calc minus @Overloading");
    }

    public void multiplication(int a, int b) {
        System.out.println("Standard calc multiplication");
    }

    public void multiplication(double a, double b) {
        System.out.println("Standard calc multiplication @Overloading");
    }

    public int division(int a, int b) {
        if (b == 0) {
            System.out.println("На ноль делить нельзя!");
        }
        int result = a / b;
        return result;
    }

    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("На ноль делить нельзя!");
        }
        double result = a / b;
        return result;
    }
}
