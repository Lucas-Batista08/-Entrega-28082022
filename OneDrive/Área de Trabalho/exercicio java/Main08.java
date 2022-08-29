    import  java . io . IOException ;
    import java.util.Scanner;
    
     public class Main08 {
        
        public  static  void  main ( String [] args ) throws IOException {
            double s;
            Scanner entrada=new Scanner(System.in); 
            System.out.print("Número de um funcionário?");
            double funcionarios = entrada. nextInt ();
            System.out.print(" Horas trabalhadas?");
            double horas = entrada.nextInt();
            System.out.print("Valor por horas trabalhadas?");
            double  valorPorHora = entrada.nextDouble ();
            double  salario = horas * valorPorHora ;
            System.out.println ( "NUMERO = " + funcionarios );
            System.out.println ( String . format ( "SALÁRIO = U$ %.2f" , salario ) );
        }
        
    } 