import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe se o ingresso será R$5,00 ou R$4,50: ");
        double ingresso = teclado.nextDouble();

        double totalVendido = 120;

        double despesas = 200;

        if(ingresso == 5) {

            double vendas = ingresso * totalVendido;

            double resultadoEvento = vendas - despesas;

            System.out.println("Lucramos nos ingressos: R$" + resultadoEvento);
        }
        if(ingresso == 4.5) {

            totalVendido = totalVendido + 26;

            double vendas = ingresso * totalVendido;

            double resultadoEvento = vendas - despesas;

            System.out.println("Lucramos nos ingressos: R$" + resultadoEvento);

        }

        if(ingresso != 5 && ingresso != 4.5) {
            System.out.println("Valor inválido para os ingressos.");
        }
    }
}
