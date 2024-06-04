import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean botao = true;

        double quantidadeCanal4 = 0;
        double quantidadeCanal5 = 0;
        double quantidadeCanal7 = 0;
        double quantidadeCanal12 = 0;
        double quantidadeTotal = 0;

        while (botao == true) {

            System.out.println("Digite o canal que você está assistindo(4, 5, 7, 12): ");
            int canal = teclado.nextInt();

            if (canal == 0) {
                botao = false;
            } else {

                System.out.println("Digite o número de pessoas que estavem assistindo: ");
                int assistindo = teclado.nextInt();

                if (canal == 4) {

                    quantidadeCanal4 = quantidadeCanal4 + assistindo;
                } else if (canal == 5) {

                    quantidadeCanal5 = quantidadeCanal5 + assistindo;
                } else if (canal == 7) {

                    quantidadeCanal7 = quantidadeCanal7 + assistindo;
                } else if (canal == 12) {

                    quantidadeCanal12 = quantidadeCanal12 + assistindo;
                }

                System.out.println("Número do canal: " + canal + ", Pessoas assistindo: " + assistindo);
            }
        }

        quantidadeTotal = quantidadeCanal4 + quantidadeCanal5 + quantidadeCanal7 + quantidadeCanal12;

        double percentualCanal4 = (quantidadeCanal4 * 100) / quantidadeTotal;
        double percentualCanal5 = (quantidadeCanal5 * 100) / quantidadeTotal;
        double percentualCanal7 = (quantidadeCanal7 * 100) / quantidadeTotal;
        double percentualCanal12 = (quantidadeCanal12 * 100) / quantidadeTotal;

        System.out.println("Percentagem de pessoas assistindo o canal 4: " + percentualCanal4 + "%");
        System.out.println("Percentagem de pessoas assistindo o canal 5: " + percentualCanal5 + "%");
        System.out.println("Percentagem de pessoas assistindo o canal 7: " + percentualCanal7 + "%");
        System.out.println("Percentagem de pessoas assistindo o canal 12: " + percentualCanal12 + "%");

    }
}
