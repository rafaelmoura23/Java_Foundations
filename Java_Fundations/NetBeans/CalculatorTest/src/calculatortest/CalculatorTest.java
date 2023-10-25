package calculatortest;

//import javax.swing.JOptionPane;

import java.util.Random;
import java.util.Scanner;


public class CalculatorTest {

    public static void main(String[] args) {
        //Calculator calc = new Calculator();
        //calc.calculate(3, 2.0);
        //calc.findTotal(10.0, "eu");
        //calc.findTotal(12.0, "eu");
        //calc.calculate(10, 2.0);
        
        //JOptionPane.showMessageDialog(null, "Olá");
        
        //String name = "rafael";
        //JOptionPane.showMessageDialog(null, name.length());
        
        Scanner numberScanner = new Scanner(System.in);
        System.out.print("Informe um número entre 1 e 10:");
        int userNum = numberScanner.nextInt();
        Random rnd = new Random();
        int winningNum = rnd.nextInt(10) + 1;
        System.out.println("Seu número: " + userNum);
        System.out.println("O número vencedor é: " + winningNum);
        
        
        
        
    }
    
}
