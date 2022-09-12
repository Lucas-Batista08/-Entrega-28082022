import java.util.Scanner;

public class exerci04 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  double max = 0 ;
  System.out.println("digite um numero para a contagem começando do "+max +" ?" );
  max= sc.nextInt();
  double cont = 0;
   while  (max > cont){
    System.out.println(cont );
    cont++;
  
  }
}
}
//*Escrever um algoritmo que leia uma quantidade desconhecida de números e conte quantos deles
//estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve
//terminar quando for lido um número negativo.*//