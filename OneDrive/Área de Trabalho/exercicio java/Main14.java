import  java.io.IOException ;
import java.util.Scanner ;

import javax.print.attribute.standard.Media;
import java.io.IOException;

 public class Main14{
	
    public  static  void  main ( String [] args ) throws  IOException {
         Scanner entrada=new  Scanner ( System.in );
        int  x = entrada . nextInt ();
        double  y = entrada. nextDouble ();
        double media = x / y ;
        System.out.println ( String . format ( "%.3f km/l", media));   
    }	
}