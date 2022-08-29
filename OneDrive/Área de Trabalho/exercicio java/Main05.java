import java.io.IOException;
import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) throws IOException {
        double s;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a nota do primeiro aluno? ");
        double a = leitor.nextDouble();
        System.out.print("Digite a nota do segundo aluno? ");
        double b = leitor.nextDouble();
        double media = ((3.5 * a) + (7.5 * b))/11;
        System.out.println(String.format("MEDIA = %.5f" , media));
    }
}