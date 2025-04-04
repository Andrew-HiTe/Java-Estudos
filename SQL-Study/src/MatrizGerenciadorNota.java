public class MatrizGerenciadorNota {
    public static void main(String[] args){
        double[][] notasAluno = {
            {7.0, 8.5, 7.5},
            {8.5, 10, 9.5},
            {8.5, 6.5, 9.5}
        };
        for (int i = 0; i < notasAluno.length; i++){
            double somaNotas = 0;
            for(int j = 0; j <  notasAluno[i].length ; j++){
                somaNotas += notasAluno[i][j];
            }
            double media = somaNotas / notasAluno[i].length;
            System.out.println("Média aluno " +(i+1)+ ": " + media);

        }
    }
    
}
