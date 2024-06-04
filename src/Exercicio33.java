import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean botao = true;

        double salarioTotal = 0;
        double filhosTotal = 0;
        double quantidadeSalario150 = 0;
        double maiorSalario = 0;
        double quantidadePessoas = 0;

        while (botao == true) {

            System.out.println("Digite o seu salário: ");
            int salario = teclado.nextInt();

            if (salario < 0) {
                botao = false;
            } else {
                System.out.println("Digite o número de filhos: ");
                int filhos = teclado.nextInt();


                if (salario <= 150) {

                    quantidadeSalario150 = quantidadeSalario150 + 1;
                }

                if (salario > maiorSalario) {

                    maiorSalario = salario;
                }

                salarioTotal = salarioTotal + salario;
                filhosTotal = filhosTotal + filhos;

                quantidadePessoas += 1;
            }
        }

        double mediaSalario = salarioTotal / quantidadePessoas;
        double mediaFilhos = filhosTotal / quantidadePessoas;

        System.out.println("Média do salário da população: " + mediaSalario);
        System.out.println("Média de filhos da população: " + mediaFilhos);
        System.out.println("Maior salário da cidade: " + maiorSalario);

        double percentual = (quantidadeSalario150 * 100) / quantidadePessoas;

        System.out.println("Percentagem de pessoas com salários até R$ 150,00: " + percentual);
    }
}
