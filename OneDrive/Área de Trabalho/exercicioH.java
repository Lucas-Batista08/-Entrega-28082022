import java.util.Scanner;

public class exercicioH {
 public static void main(String[] args) {
 Scanner entrada=new Scanner(System.in);

  System.out.print("diga um numero? ");
 int numero= entrada.nextInt();
 System.out.println("digite um numero? ");
 int numero2= entrada.nextInt();
 double result= (numero+numero2)/2;
    result=entrada.nextDouble();
 System.out.print(numero+numero2);
}
}
