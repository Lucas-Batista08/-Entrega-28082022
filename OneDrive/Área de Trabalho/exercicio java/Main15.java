import java.io.IOException ;
import  java.util.Scanner ;

 public class Main15{
	
    public  static  void  main ( String [] args ) throws  IOException {
    	 Scanner entrada =new Scanner (System.in );
         double  x1 = entrada.nextDouble ();
        double  y1 = entrada.nextDouble ();
        double  x2 = entrada. nextDouble ();
        double  y2 = entrada. nextDouble ();
        double distancia = Math . sqrt ( Math . pow (( x2 - x1 ), 2 ) + Math . pow (( y2 - y1 ), 2 ));
        System.out.println ( String . format ( "%.4f" , distancia ));
    }
	
}