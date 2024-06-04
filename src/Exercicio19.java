import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        int contador = 1;

        double quantidadeNumero30A90 = 0;
        while (contador <= 10) {

            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite o " + contador + "º número");
            int numero = teclado.nextInt();

            if (numero > 30 && numero < 90) {

                quantidadeNumero30A90 = quantidadeNumero30A90 + 1;
            }

            contador++;
        }

        System.out.println("Quantidade de números entre 30 e 90: " + quantidadeNumero30A90);
    }
}
