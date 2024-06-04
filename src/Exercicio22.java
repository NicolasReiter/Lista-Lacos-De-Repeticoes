import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do carro: ");
        double valor = teclado.nextDouble();

        System.out.println("Valor do carro comprando-o à vista, com 20% de desconto: " + (valor * 0.80));
        System.out.println("quantidade de parcelas                  acrescimmo de preços");
        System.out.println("      6                                      " + valor * 1.03);
        System.out.println("      12                                     " + valor * 1.06);
        System.out.println("      18                                     " + valor * 1.09);
        System.out.println("      24                                     " + valor * 1.12);
        System.out.println("      30                                     " + valor * 1.15);
        System.out.println("      36                                     " + valor * 1.18);
        System.out.println("      42                                     " + valor * 1.21);
        System.out.println("      48                                     " + valor * 1.24);
        System.out.println("      54                                     " + valor * 1.27);
        System.out.println("      60                                     " + valor * 1.30);
    }
}
