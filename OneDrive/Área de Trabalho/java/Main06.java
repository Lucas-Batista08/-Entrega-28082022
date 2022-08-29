import java.util.Scanner;
import javax.security.sasl.RealmCallback;
public class Main06{
    public static void main (String[] args)
    {
        Scanner entrada=new Scanner(System.in);
        System.out.print("digite um numero:");
        double numb1 =entrada.nextInt();
        System.out.print("digite outro numero:");
        double numb2 =entrada.nextInt();
        double div = numb1 / numb2;
        System.out.print(div);
    
    }
}