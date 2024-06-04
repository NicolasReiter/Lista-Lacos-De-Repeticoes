import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 1;

        double quantidadeOtimo = 0;
        double totalIdadesOtimo = 0;
        double quantidadeBom = 0;
        double quantidadeRegular = 0;

        while (contador <= 15) {

            System.out.println("Digite a idade da " + contador + "º pessoa: ");
            double idade = teclado.nextDouble();
            System.out.println("Digite sua opinião em relação ao filme(Ótimo – 3, Bom – 2, Regular – 1): ");
            double opiniao = teclado.nextDouble();

            if (opiniao == 3) {

                quantidadeOtimo = quantidadeOtimo + 1;

                totalIdadesOtimo = totalIdadesOtimo + idade;
            } else if(opiniao == 2) {

                quantidadeBom = quantidadeBom + 1;
            } else if (opiniao == 1) {

                quantidadeRegular = quantidadeRegular + 1;
            }

            contador++;
        }

        double mediaIdadesOtimo = totalIdadesOtimo / quantidadeOtimo;

        System.out.println("Média das idades das pessoas que responderam ótimo: " + mediaIdadesOtimo);

        System.out.println("Quantidade de pessoas que respondeu regular: " + quantidadeRegular);

        double percentual = (quantidadeBom * 100) / 15;

        System.out.println("Percentagem de pessoas que respondeu bom entre todos os espectadores analisados: " + percentual + "%");
    }
}
