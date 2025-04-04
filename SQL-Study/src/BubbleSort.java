public class BubbleSort {
    public static void main(String[] Args ){
        int[] numeros = {5, 25, 10, 2, 1};
        
        boolean houveTroca;

        do{
            houveTroca = false;
            for (int i = 0; i < numeros.length - 1; i++){
                
                if (numeros[i] > numeros[i + 1]){
                    int temp = numeros[i];
                    numeros[i] = numeros[i+1];
                    numeros[i+1] = temp;
                    
                    houveTroca = true;
                    
                }
            } 
        } while (houveTroca);

        for (int numero : numeros){
            System.out.println(numero);
        };
    }
    
}
