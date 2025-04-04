public class Matriz {
    public static void main(String[] args){
        int[][] matriz = { 
            {1,4,2},
            {6,9,5},
            {8,4,10}
        };
        System.out.println(matriz.length);
        System.out.println();
        System.out.println("MATRIZ");
        for (int i = 0 ; i < matriz.length ; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
