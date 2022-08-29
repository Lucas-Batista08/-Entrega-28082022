import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int CODIGO1, PECAS1;
		int CODIGO2, PECAS2;
		double VALOR1, VALOR2, VALOR;
        
        System.out.print("digite o codigo,numero de peças e o valor unitario? ");
		CODIGO1 = input.nextInt();
		PECAS1 = input.nextInt();
		VALOR1 = input.nextDouble();
        System.out.print("Digite o numero de um a peça,numero de peças e o valor unitario?");
		CODIGO2 = input.nextInt();
		PECAS2 = input.nextInt();   
    	VALOR2 = input.nextDouble();
		VALOR = PECAS1 * VALOR1 + PECAS2 * VALOR2;
        System.out.println("VALOR A PAGAR:$ " + df.format(VALOR));

    }
} 