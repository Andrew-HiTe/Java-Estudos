import java.util.Scanner;

public class MatrizCinema {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Dados armazenados na matriz
        int[][] salaCinema = {
            {0,0,1,0,1},
            {0,1,1,0,1},
            {1,0,0,0,1},
            {0,0,1,0,1}
        };

        // Exibindo a situação atual
        System.out.println("Situação atual dos assentos (L = Livre, X = Ocupado)");
        for (int i = 0; i < salaCinema.length; i++ ){
            for(int j = 0; j < salaCinema[i].length; j++){
                System.out.print(salaCinema[i][j] == 0 ? "(L) " : "(X) ");
            }
            System.out.println("  <--  Fila " + (i+1));
        }
        System.out.println("Escolha a fila:");
        int fileiraEscolhida = scanner.nextInt() -1;
        
        System.out.println("Escolha o assento:");
        int assentoEscolhido = scanner.nextInt() -1;

        if (fileiraEscolhida >= 0 && fileiraEscolhida < salaCinema.length && assentoEscolhido >= 0 && assentoEscolhido < salaCinema[fileiraEscolhida].length){
            if (salaCinema[fileiraEscolhida][assentoEscolhido] == 0){
                salaCinema[fileiraEscolhida][assentoEscolhido] = 1;
                System.out.println("Assento reservado com sucesso");
            }else{ 
                System.out.println("Assento já está ocupado, escolha outro.");
            }
        }else{
            System.out.println("A escolha do assento ou fileira está inválido, tente novamente.");
        }
        scanner.close();

        
    }
}
