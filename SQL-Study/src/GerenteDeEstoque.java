import java.util.Scanner;

public class GerenteDeEstoque {
    public static void main(String[] args) {
        String[] produtos = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i < produtos.length; i++){
            System.out.println("Digite o nome do produto a cadastrar:");
            produtos[i]= scanner.next() + scanner. nextLine();

        }
        System.out.println("Digite o nome do produto que deseja procurar:");
        String produtoProcurado = scanner.next() + scanner.nextLine();

        boolean produtoEncontrado = false;
        int i = 0;
        while (!produtoEncontrado && i < produtos.length){
            if (produtos[i].equals(produtoProcurado) ){
                produtoEncontrado = true;
            }
            i++;
        }

        if (produtoEncontrado){
            System.out.println ("O produto procurado está disponível no estoque");
        }else {
            System.out.println("O produto procurado não está no estoque");
        }
        
    }

}