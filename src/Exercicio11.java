import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numero = teclado.nextInt();

        int contador;

        for(contador = 1; contador <= numero; contador++) {

            if((contador % 2) == 0) {

                System.out.println("Número par:");
                System.out.println(contador);
            } else {

                System.out.println("Número ímpar:");
                System.out.println(contador);
            }
        }


    }
}
