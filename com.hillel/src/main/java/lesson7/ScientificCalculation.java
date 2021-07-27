package lesson7;

public class ScientificCalculation extends StandardCalculation {
    @Override
    public void description(){
        System.out.println("Инженерный калькулятор имеет функции");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        System.out.println("Pi");
        System.out.println("Log");
        System.out.println("...");
        System.out.println("...");
        System.out.println("etc");
    }
    @Override
    public int plus(int a, int b) {
        System.out.println("Scientific calc plus");
        int result = a + b;
        return result;
    }
    @Override
    public double plus(double a, double b) {
        System.out.println("Scientific calc plus @Overloading");
        double result = a + b;
        return result;
    }
    @Override
    public void minus(int a, int b) {
        System.out.println("Scientific calc minus");
    }
    @Override
    public void minus(double a, double b) {
        System.out.println("Scientific calc minus @Overloading");
    }
    @Override
    public void multiplication(int a, int b) {
        System.out.println("Scientific calc multiplication");
    }
    @Override
    public void multiplication(double a, double b) {
        System.out.println("Scientific calc multiplication @Overloading");
    }
    @Override
    public int division(int a, int b) {
        if (b == 0){
            System.out.println("На ноль делить нельзя!");
        }
        int result = a / b;
        return result;
    }
    @Override
    public double division(double a, double b) {
        if (b == 0){
            System.out.println("На ноль делить нельзя!");
        }
        double result = a / b;
        return result;
    }

    public double pi(){
        return Math.PI;
    }

    public void log(double logOfNum){
        System.out.println(Math.log(logOfNum));
    }
}
