import java.util.Scanner;

public class exerci07 {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    int number;
    int n0 = 0,n1 = 1,n2= 2,
    n3 = 3,
    n4= 4,n5 = 5,n6 = 6,n7 = 7,n8 = 8,n9= 9, n10 =10 ;
    int result0;
    int result1;
    int result2;
    int result3;
    int result4;
    int result5;
    int result6;
    int result7;
    int result8;
    int result9;
    int result10;
   
     System.out.print("digite um numero que deseja multiplicar ");
     number= sc.nextInt();
     result0= (number * n0 );
     result1= (number * n1);
     result2= (number * n2);
     result3= (number * n3);
     result4= (number * n4);
     result5= (number * n5);
     result6= (number * n6);
     result7= (number * n7);
     result8= (number * n8);
     result9= (number * n9);
     result10= (number * n10);
     System.out.println(number+" X N ="+ result0+"N");
     System.out.println(number+" X N ="+ result1+"N");
     System.out.println(number+" X N ="+ result2+"N");
     System.out.println(number+" X N ="+ result3+"N");
     System.out.println(number+" X N ="+ result4+"N");
     System.out.println(number+" X N ="+ result5+"N");
     System.out.println(number+" X N ="+ result6+"N");
     System.out.println(number+" X N ="+ result7+"N");
     System.out.println(number+" X N ="+ result8+"N");
     System.out.println(number+" X N ="+ result9+"N");
     System.out.println(number+" X N ="+ result10+"N");
     

   }
}

//Escrever um algoritmo que leia um valor para uma variável N de 1 a 10 e calcule a tabuada de
//N. Mostre a tabuada na forma: 0 x N = 0, 1 x N = 1N, 2 x N = 2N, ..., 10 x N = 10N.
