import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean botao = true;

        double quantidade = 0;
        double quantidadeMenor35 = 0;
        double quantidadePositivo = 0;
        double quantidade50E100 = 0;
        double quantidadeMenor50 = 0;
        double quantidade10E20 = 0;

        while (botao == true) {

            System.out.println("Digite o um número: ");
            double numero = teclado.nextDouble();

            if(numero == 0) {

                break;
            }

            if(numero < 35){

                quantidadeMenor35 = quantidadeMenor35 + 1;
            }

            if(numero > 0) {

                quantidadePositivo = quantidadePositivo + 1;
            }

            if(numero >= 50 && numero <= 100) {

                quantidade50E100 = quantidade50E100 + 1;
            }

            if(numero < 50) {

                quantidadeMenor50 = quantidadeMenor50 + 1;
            }

            if(numero >= 10 && numero <= 20) {

                quantidade10E20 = quantidade10E20 + 1;
            }

            quantidade += 1;
        }

        System.out.println("Quantidade de números inferiores a 35: " + quantidadeMenor35);

        double mediaPositiovs = quantidadePositivo / quantidade;

        System.out.println("Média dos números positivos: " + mediaPositiovs);

        double percentual50E100 = (quantidade50E100 * 100) / quantidade;

        System.out.println("Percentual de números enter 50 e 100 entre todos os números digitados: " + percentual50E100 + "%");

        double percentual10E20 = (quantidade10E20 * 100) / quantidadeMenor50;

        System.out.println("Percentual de números entre 10 e 20 entre os números menores que 50: " + percentual10E20 + "%");
    }
}
