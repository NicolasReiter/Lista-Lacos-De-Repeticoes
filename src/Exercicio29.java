import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite a nota da sua 1º prova: ");
            double nota1 = teclado.nextDouble();
            System.out.println("Digite a nota da sua 2º prova: ");
            double nota2 = teclado.nextDouble();
            System.out.println("Digite a nota da sua 3º prova: ");
            double nota3 = teclado.nextDouble();
            System.out.println("Digite quantos dias você foi para a aula no semestre: ");
            double aulas = teclado.nextDouble();


            double notaFinal = (nota1 + nota2 + nota3) / 3;

            if (notaFinal >= 6 && aulas >= 40) {

                System.out.println("Você foi aprovado");
            } else {

                System.out.println("Você foi reprovado");
            }
    }
}
