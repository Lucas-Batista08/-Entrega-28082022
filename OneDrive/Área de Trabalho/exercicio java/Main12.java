import  java.io.IOException ;
import  java.util.Scanner ;

 public class Main12{
	
    public  static  void  main ( String [] args ) throws IOException {
         try (Scanner entrada = new Scanner ( System.in)) {
            double  a = entrada.nextDouble ();
            double b = entrada.nextDouble ();
            double c = entrada.nextDouble ();
            double triângulo = a * c / 20. ;
            double circulo =3.14159 * ( c * c );
            double trapézio = (( a + b ) * c ) / 2 ;
            double quadrado =b * b ;
            double retangulo = a * b ;
            System.out.println ( String . format ( "TRIÂNGULO: %.3f" , triângulo ));
            System.out.println ( String . format ( "CIRCULO: %.3f" , circulo ));
            System.out.println ( String . format ( "TRAPEZIO: %.3f" , trapézio ) );
            System.out.println ( String . format ( "QUADRADO: %.3f" , quadrado ));
            System.out.println ( String . format ( "RETANGULO: %.3f" , retangulo ));
        }  
    }
}
	

