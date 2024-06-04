import java.util.Scanner;

public class Exercicio36 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean botao = true;

        double quantidadeLucro1000 = 0;
        double quantidadeLucro200 = 0;
        double lucroTotal = 0;

        while (botao == true) {

            System.out.println("Digite o tipo da ação: ");
            String acao = teclado.next().toUpperCase();

            if (acao.equals("F")) {

                break;
            }

            System.out.println("Digite o preço de compra da ação: ");
            double compra = teclado.nextDouble();
            System.out.println("Digite o preço de venda da ação: ");
            double venda = teclado.nextDouble();

            double lucro = venda - compra;

            System.out.println("Lucro da ação " + acao + ": R$" + lucro);

            if(lucro > 1000) {

                quantidadeLucro1000 = quantidadeLucro1000 + 1;
            }

            if(lucro < 200) {

                quantidadeLucro200 = quantidadeLucro200 + 1;
            }

            lucroTotal = lucroTotal + lucro;
        }

        System.out.println("Quantidade de ações com lucro superior a R$1.000: " + quantidadeLucro1000);
        System.out.println("Quantidade de ações com lucro inferior a R$200: " + quantidadeLucro200);
        System.out.println("Lucro total da empresa: R$" + lucroTotal);
    }
}
