import java.util.Scanner;
    public class exerci03{
        public static void main (String[]args){
           Scanner sc=new Scanner(System.in);
           double cont = 0;
           double numero =0;
           double mediaaritimetica = 0;
           double valorpositivo = 0;
           double valornegativo = 0;
           double percenpositivonegativo = 0; 
           double[] notas;   
           double soma = 0; 

            System.out.println("digite quantidas de numero vai ter na aritimetica? ");
            cont = sc.nextInt();
            
            if (cont >=0) {
                notas = new double[(int) cont];
                
                for (int i = 0; i< notas.length; i++){
                    
                    System.out.print("digite a " + (i + i) + " nota: " );
                    notas[i] = sc.nextDouble();
                soma += notas[i];
                }
                mediaaritimetica = soma / cont;
                valorpositivo = soma + cont;
                valornegativo = soma - cont;
                percenpositivonegativo = soma % cont;

            }
             System.out.println("media aritimetica: "+ mediaaritimetica);
           System.out.println("quantidades de valores positivos: "+ valorpositivo);
           System.out.println("quantidade de valores negativos: "+ valornegativo);
           System.out.println("percentual de numeros positivos e negativos: "+ percenpositivonegativo);

        }
    }
 