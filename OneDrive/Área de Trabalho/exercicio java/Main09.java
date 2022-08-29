import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main09 {
        public  static  void  main ( String [] args ) throws  IOException {
     
             Scanner entrada  = new  Scanner ( System . in );
            DecimalFormat  df = new  DecimalFormat ("0.00" );
            String  NOME ;
            double s, TOTAL ;
        
            System.out.print("Nome do vendedor? ");
            NOME = entrada .next();
            System.out.print("nome do salario ? ");
            Double SALÁRIO = entrada.nextDouble ();
            System.out.print("valor das vendas? ");
            Double Vendas = entrada.nextDouble ();
    
            TOTAL = SALÁRIO + Vendas * 0.15 ;
            System.out.println ( "TOTAL = R$" + df . format ( TOTAL ));
        }
}