    import java.util.Scanner;
    public class exerci10{
        public static void main (String[]args){
           try (Scanner sc = new Scanner(System.in)) {
            int max=sc.nextInt();
               int cont=0;
               int zoom;
               while(cont > max){
                System.out.println(cont);
                cont++;
                zoom=cont*cont;
                    

                
                 System.out.println(zoom);
            }
        }
        }
    }