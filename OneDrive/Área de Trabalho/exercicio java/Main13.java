import  java.io.IOException ;
import  java.util.Scanner ;

 public class Main13 {
	
    public  static  void  main ( String [] args ) throws  IOException {
         try (Scanner entrada = new Scanner ( System.in )) {
            System.out.print("digite um numeoro? ");
            int  valor1 = entrada.nextInt ();
            System.out.print("digite outro numero? ");
            int  valor2 = entrada.nextInt ();
            System.out.print("digite outro numero? ");
            int  valor3 = entrada.nextInt ();
            if ( valor1 > valor2 && valor1 > valor3 ) {
            	System.out.println ( valor1 + " eh o maior" );
            } else  if ( valor2 > valor3 ) {
            	System.out.println ( valor2 + " eh o maior" );
            } else {
            	System.out.println ( valor3 + " eh o maior" );
            }
        }
    }
	
}
