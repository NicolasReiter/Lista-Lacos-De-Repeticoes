import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor de compra do cliente: ");
        double compra = teclado.nextDouble();

        if (compra > 500) {

            double desconto = (compra - 500) / 100;

            if(desconto <= 25) {

                double valorFinal = compra * (1-(desconto /100));

                System.out.println("Valor da compra: R$" + compra + " - " + "Porcentagem de desconto: " + desconto + "% - " +
                        "Valor final: R$" + valorFinal);
            }

            if(desconto > 25) {

                desconto = 25;

                double valorFinal = compra * (1-(desconto /100));

                System.out.println("Valor da compra: R$" + compra + " - " + "Porcentagem de desconto: 25% - " +
                        "Valor final: R$" + valorFinal);
            }
        }

        if(compra <= 500) {

            System.out.println("Não possui nenhum desconto");
        }
    }

}
