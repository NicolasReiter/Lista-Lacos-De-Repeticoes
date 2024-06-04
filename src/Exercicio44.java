import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean loop = true;

        double juros = 0;
        double jurosTotal = 0;

        while(loop == true) {


            System.out.println("Digite o código da conta: ");
            double codigo = teclado.nextDouble();

            if(codigo <= 0) {
                break;
            }
            System.out.println("Digite o tipo da conta: \n Tipo     Descrição     Rendimento mensal\n" +
                    "  1       Poupança             1,5%\n" +
                    "  2       Poupança plus         2%\n" +
                    "  3       Fundos de renda       4%");
            double tipo = teclado.nextDouble();
            System.out.println("Digite o valor investido: ");
            double valor = teclado.nextDouble();

            if(tipo == 1) {

                juros = (valor * 0.015);
                valor = valor + juros;
                System.out.println("Rendimento mensal da poupança: R$" + valor);
            } else if(tipo == 2) {

                juros = (valor * 0.02);
                valor = valor + juros;
                System.out.println("Rendimento mensal da poupança plus: R$" + valor);
            } else if(tipo == 3) {

                juros = (valor * 0.04);
                valor = valor + juros;
                System.out.println("Rendimento mensal do fundo de renda: R$" + valor);
            }
        }

        jurosTotal = jurosTotal + juros;
        System.out.println("Total de juros pagos: R$" + jurosTotal);
    }
}
