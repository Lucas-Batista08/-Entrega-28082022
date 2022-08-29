    import java.io.IOException;
    import java.util.Scanner;
    
    public class Main07 {
        
        public static void main(String[] args) throws IOException {
           String s;
            Scanner leitor = new Scanner(System.in);
            System.out.print("digite um numero:");
            int a = leitor.nextInt();
            System.out.print("digite um numero:");
            int b = leitor.nextInt();
            System.out.print("digite um numero:");
            int c = leitor.nextInt();
            System.out.print("digite um numero:");
            int d = leitor.nextInt();
            int diferenca = a * b - c * d;
            System.out.println(" A DIFERENCA = " + diferenca);
        }
        
    }
