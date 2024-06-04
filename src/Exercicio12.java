import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int ladoQuadrado = teclado.nextInt();

        String asterisco = "*";

        int linha;
        int coluna;

        if (ladoQuadrado < 1 || ladoQuadrado > 20) {

            System.out.println("Número inválido");
        } else {

            for (linha = 1; linha <= ladoQuadrado; linha++) {

                for (coluna = 1; coluna <= ladoQuadrado; coluna++) {

                    System.out.print(asterisco);

                }

                System.out.println(" ");

            }
        }
    }
}
