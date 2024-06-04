import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int valor;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número para a tabuada: ");

        valor =  teclado.nextInt();

        int contador;
        for(contador = 0; contador <= 10; contador++) {

          int resultado = valor * contador;

            System.out.println( valor + "x" + contador + "=" + resultado);
        }
    }
}
