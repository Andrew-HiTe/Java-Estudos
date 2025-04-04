public class BinarySearch {
    public static void main(String[] args) {
        int[] vetorOrdenado = {0,11,22,33,44,55,66,77,88,99};
                            // 0  1  2  3  4  5  6  7  8  9 ---> no total tenho 10 posições só que só usarei até o 9
                            // então vai ser length -1
        int inicio = 0;
        int fim = vetorOrdenado.length -1;
        
        int elementoProcurado = 21;
        int valorEncontrado = -1;
        
        while(inicio <= fim){
            int meio = inicio + (fim - inicio) / 2;
            if (vetorOrdenado[meio] == elementoProcurado) {
                valorEncontrado = meio;
                break;
            } else if (vetorOrdenado[meio] < elementoProcurado){
                inicio = meio +1;
            } else {
                fim = meio -1;
            }
        }
        if (valorEncontrado!= -1){
            System.out.println("a posição do valor procurado está na :" + valorEncontrado);
        }else {
            System.out.println("Número não disponível");
        }
    }
}
