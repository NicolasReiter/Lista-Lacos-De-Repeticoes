import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial dele: ");
        int numero = teclado.nextInt();

        int contador = 1;
        int multiplicacao = 1;

        if(numero == 0) {

            multiplicacao = 1;
        } else {

            while (contador <= numero) {

                multiplicacao = multiplicacao * contador;

                contador++;
            }
        }

        System.out.println("Resultado do fatorial de " + numero + "é: " + multiplicacao);
    }
}
