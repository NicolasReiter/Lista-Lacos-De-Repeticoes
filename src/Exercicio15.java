import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 1;

        double compraV = 0;
        double compraP = 0;
        int totalCompras = 0;
        double totalParcelas = 0;

        while (contador <= 15) {

            System.out.println("Digite o código da transação: ");
            String codigo = teclado.next().toUpperCase();
            System.out.println("Digite o valor da transação " + codigo + ": ");
            double valor = teclado.nextDouble();

            if(codigo.equals("V")) {
                compraV = compraV + valor;
            } else if(codigo.equals("P")) {
                compraP = compraP + valor;

                totalParcelas = totalParcelas + (valor / 3);
            } else if(valor > 0) {
                totalCompras = (int) (totalCompras + valor);
            }

            contador++;
        }

        System.out.println("Valor total das compras à vista: " + compraV);
        System.out.println("Valor total das compras a prazo: " + compraP);
        System.out.println("Valor total das compras: " + totalCompras);
        System.out.println("Valor da primeira prestação das compras a prazo: " + totalParcelas);

    }
}
