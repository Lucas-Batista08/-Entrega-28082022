public class exerc01 {
    public static void main(String[] args ){
      
        double result = 0;
    
        for(int i = 1; i <=500 ; i ++){
            if(i % 2 == 0 && i % 3!= 0 ){
                 result = result + 1 ;
    }
    }
    System.out.println(result);
}
} //numero impar