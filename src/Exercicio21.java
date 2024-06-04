import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 1;

        double idadeTotal = 0;
        double quantidadeMulher = 0;
        double quantidadeHomem = 0;
        double idadeMulher = 0;
        double idadeHomem = 0;

        while (contador <= 7) {

            System.out.println("Digite a idade da " + contador + "º pessoa: ");
            double idade = teclado.nextDouble();
            System.out.println("Digite o sexo(H - Homem, M - Mulher) da " + contador + "º pessoa: ");
            String sexo = teclado.next().toUpperCase();

            if(sexo.equals("M")) {

                quantidadeMulher = quantidadeMulher + 1;

                idadeMulher = idadeMulher + idade;

            } else if(sexo.equals("H")) {

                quantidadeHomem = quantidadeHomem + 1;

                idadeHomem = idadeHomem + idade;
            }

            if(idade > 0) {

                idadeTotal = idadeTotal + idade;
            }

            contador++;
        }

        double mediaIdadeTotal = idadeTotal / 7;

        System.out.println("Idade média do grupo: " + mediaIdadeTotal);

        double mediaIdadeMulher = idadeMulher / quantidadeMulher;

        System.out.println("Idade média das mulheres: " + mediaIdadeMulher);

        double mediaIdadeHomem = idadeHomem / quantidadeHomem;

        System.out.println("Idade média dos homens: " + mediaIdadeHomem);
    }
}
