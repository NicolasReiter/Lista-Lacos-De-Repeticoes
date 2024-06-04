import java.util.Scanner;

public class Exercicio35 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean botao = true;

        double quantidade = 0;
        double valorTotalPreco = 0;
        double valorTotalNovoPreco = 0;

        while (botao == true) {

            System.out.println("Digite o código do produto: ");
            double codigo = teclado.nextDouble();


            if (codigo < 0) {

                break;
            } else {

                System.out.println("Digite o  preço do produto");
                double preco  = teclado.nextDouble();

                double novoPreco  = preco + (0.20 * preco);

                valorTotalPreco = valorTotalPreco + preco;
                valorTotalNovoPreco = valorTotalNovoPreco + novoPreco;

                System.out.println("Código do produto: " + codigo + ", novo preço: " + novoPreco);

                quantidade += 1;

            }
        }

        double mediaPreco = valorTotalPreco / quantidade;
        double mediaNovoPreco = valorTotalNovoPreco / quantidade;

        System.out.println("Média dos preços sem aumento: R$" + mediaPreco);
        System.out.println("Média dos preços com aumento de 20%: R$" + mediaNovoPreco);
    }
}
