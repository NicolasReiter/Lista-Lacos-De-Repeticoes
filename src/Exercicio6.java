import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        int lojaB = 54000;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor de vendas do cliente 1: ");
        int cliente1 = teclado.nextInt();

        System.out.println("Informe o valor de vendas do cliente 2: ");
        int cliente2 = teclado.nextInt();

        System.out.println("Informe o valor de vendas do cliente 3: ");
        int cliente3 = teclado.nextInt();

        System.out.println("Informe o valor de vendas do cliente 4: ");
        int cliente4 = teclado.nextInt();

        System.out.println("Informe o valor de vendas do cliente 5: ");
        int cliente5 = teclado.nextInt();

        int faturamento = cliente1 + cliente2 + cliente3 + cliente4 + cliente5;

        if (faturamento > lojaB) {

            int diferenca = faturamento - lojaB;

            System.out.println("O faturamento da nossa loja superou a loja B em: " + diferenca);
        }

        if (faturamento < lojaB) {
            System.out.println("Infelizmente não superamos a loja B");
        }

        if (faturamento == lojaB) {
            System.out.println("Nosso faturamento foi igual ao da loja B");
        }
    }

}
