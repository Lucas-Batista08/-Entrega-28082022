import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.IOException;
public class Main11 {
        public static void main(String[] args) throws IOException {
     
            Scanner input = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("0.000");
            int R;
            double pi, VOLUME;
            pi = 3.14159;
            System.out.print(" Qual o volume de esferar? ");
            R = input.nextInt();
            VOLUME = (4/3.0) * pi * Math.pow(R,3);
            System.out.println("VOLUME = " + df.format(VOLUME));
    
}   
}