import java.util.Scanner;

public class GerenteDeNotas {
    public static void main(String[] args){
        Scanner digite = new Scanner(System.in);
        double[] notas = new double[5];
        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a "+ (i+1) + "ª nota do aluno ");
            notas[i] = digite.nextDouble();
        }
        System.out.println("As notas são:");

        // Exibe todas as notas e vai somando
        double soma = 0;
        for (int i = 0; i < notas.length; i++){
            soma += notas[i];
            System.out.println(notas[i]);
        }
        double media = soma / notas.length;
        System.out.println("Soma ------>" + soma);
        System.out.println("Média ------>" + media);

        if(media >= 7){
            System.out.println("Aluno Aprovado");
        }else{
            System.out.println("Aluno Reprovado");
        }
        
    }
}
