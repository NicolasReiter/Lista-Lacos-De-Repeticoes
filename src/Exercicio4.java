import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        int valor;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número inteiro e positivo: ");

        valor = teclado.nextInt();

        double soma = 0;
        for (int i = 1; i <= valor; i++) {
            soma = soma + (double)1/i;
            System.out.println("1/"+i);
            System.out.println(soma);
        }



    }
}
