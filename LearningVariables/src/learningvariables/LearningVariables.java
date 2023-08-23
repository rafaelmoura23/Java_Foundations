package learningvariables;


public class LearningVariables {
    public static void main(String[] args) {
       //System.out.println("Internacional de Limeira");
       //int diff = 0;
       //int num1 = 31;
       //int num2 = 6;
       //diff = num1 % num2;
       //System.out.println(diff);

       //int  xx = 9/2;
       //double x = 9/2.0;
       //System.out.println(x);
       
       //final double PI = 3.141592;
       //PI = 3.15665588666;
//System.out.println(PI);
       
//       int ovos = 0;
//       double mediaDia = 0;
//       double mediaMes = 0;
//       double lucroMes = 0;
//       ovos+=100;
//       ovos+=121;
//       ovos+=117;
//       mediaDia = ovos/3;
//       mediaMes = (ovos*300)/30;
//       lucroMes = mediaMes*0.18;
//       System.out.println(ovos);
//       System.out.println(mediaDia);
//       System.out.println(mediaMes);
//       System.out.println(lucroMes);

//         int num1 = 55555;
//         long num2 = 66666;
//         long num3;
//         
//         num3 = num1 * num2;
//         System.out.println(num3);

           int myInt;
           double myPercent = 20.5;
           System.out.println(myPercent);
           myInt = (int)myPercent;
           System.out.println(myInt);
            
//              String input = JOptionPane.showInputDialog("Mensagem");
//              JOptionPane.showMessageDialog(null, "Não há uma entrada aqui; apenas uma mensagem", "Título",0);

String inputString = JOptionPane.showInputDialog("??");
int input = Integer.parseInt(inputString);
input++;

int input = Integer.parseInt(JOptionPane.showInputDialog("??")) + 1;

    }
    
}
