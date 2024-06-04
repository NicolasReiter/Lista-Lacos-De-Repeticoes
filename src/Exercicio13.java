import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int ladoQuadrado = teclado.nextInt();

        int linha = 1;
        int coluna = 1;

        if (ladoQuadrado < 1 || ladoQuadrado > 20) {

            System.out.println("Número inválido");
        } else {

            while (linha <= ladoQuadrado) {

                while (coluna <= ladoQuadrado) {

                    if ((linha == 1) || (linha == ladoQuadrado)) {
                        System.out.print("* ");
                        coluna++;
                    } else {
                        if ((coluna == 1) || (coluna == ladoQuadrado)) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                        coluna++;
                    }
                }
                System.out.println("");
                linha++;
                coluna = 1;
            }
        }
    }
}

