import java.util.Scanner;
import  java.text.DecimalFormat;
public class Main002 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat eee = new DecimalFormat("0.0000");
        double number1 , number2,s;
        

        number2 = Math.PI;
        
        System.out.print("xxxx: ");
        number1= input.nextDouble();

        s = number2 * Math.pow(number1, 2);

        System.out.print("AREA = " + eee.format(s));
    }
}