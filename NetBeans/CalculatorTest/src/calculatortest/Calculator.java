package calculatortest;


public class Calculator {
    double tax = 0.15;
    double tip = 0.05;
    
    public void calculate1(int x, double y){
        //System.out.println(x/y);
    }
    
    public double calculate(int x, double y){
        double quotient = x/y;
        return quotient;
    }
    
    
    public void findTotal(double price, String name){
        double total = price * (1 + tax + tip);
        System.out.println(name + ": $ " + total);

    }
    
}
