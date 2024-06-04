import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int altura = teclado.nextInt();

        String triangulo = " ";

        int contador;
        int linha;

        for (contador = 1; contador <= altura; contador++) {

            for (linha = 1; linha <= altura; linha++) {
                if (contador == linha) {
                    triangulo += "*";
                }
            }

            System.out.println(triangulo);
        }
    }
}
