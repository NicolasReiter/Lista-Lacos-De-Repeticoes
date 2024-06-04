import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador  = 1;

        double nota[] = new double[3];

        double quantidadeReprovados = 0;
        double quantidadeReprovadosFalta = 0;

        double maior = -1, menor = -1;

        int i;

        while(contador <= 10) {

            System.out.println("Digite o número da sua matrícula: ");
            int matricula = teclado.nextInt();
            System.out.println("Digite a nota da sua 1º prova: ");
            nota[0] = teclado.nextDouble();
            System.out.println("Digite a nota da sua 2º prova: ");
            nota[1] = teclado.nextDouble();
            System.out.println("Digite a nota da sua 3º prova: ");
            nota[2] = teclado.nextDouble();
            System.out.println("Digite quantos dias você foi para a aula no semestre: ");
            double aulas = teclado.nextDouble();

            double notaFinal = ( nota[0] +  nota[1] +  nota[2]) / 3;

            if (notaFinal >= 6 && aulas >= 40) {

                boolean aprovado = true;

                System.out.println("Matrícula: " + matricula + ", Nota final: " + notaFinal + ", Aprovado: " + aprovado);
            } else{

                boolean aprovado = false;

                System.out.println("Matrícula: " + matricula + ", Nota final: " + notaFinal + ", Aprovado: " + aprovado);

                quantidadeReprovados = quantidadeReprovados + 1;
            }

            if (aulas < 40) {

                quantidadeReprovadosFalta = quantidadeReprovadosFalta + 1;
            }



            for(i = 0; i < 3; i++) {
                if (nota[i] < menor || menor == -1) {
                    menor = nota[i];
                }
                if (nota[i] > maior) {
                    maior = nota[i];
                }
            }


            contador++;
        }

        System.out.println("Maior nota: " + maior + " e Menor nota: " + menor);
        System.out.println("Total de alunos reprovados: " + quantidadeReprovados);

        double percentual = (quantidadeReprovadosFalta * 100) / 10;

        System.out.println("Percentagem de alunos reprovados por frequência abaixo da mínima necessária: " + percentual + "%");
    }
}
