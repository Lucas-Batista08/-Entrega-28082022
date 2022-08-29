import java.util.Scanner;
public class Main001 {
    public static void main (String[] args)
    {
        try (Scanner entrada = new Scanner(System.in)) {
            int numb1 ;
            int numb2 ;
            int s ;
            System.out.print("digite um numero:");
            numb1 =entrada.nextInt();
            System.out.print("digite outro numero:");
            numb2 =entrada.nextInt();
            System.out.printf("X=%d",s=numb1+numb2);
        }
        
    }

}