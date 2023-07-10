package calculator;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public double divide(double a, double b) {
        if (b == 0)
            return 0;
        else 
            return a / b;
    }
    public double sqrt(double a) {
        if(a<0)
            return 0;
        else
            return Math.sqrt(a);
    }
}