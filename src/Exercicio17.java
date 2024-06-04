import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 1;

        double peso90Mais = 0;
        double idadeTotal = 0;

        while (contador <= 7) {

            System.out.println("Digite a idade da " + contador + "º pessoa: ");
            double idade = teclado.nextDouble();
            System.out.println("Digite o peso da " + contador + "º pessoa: ");
            double peso = teclado.nextDouble();

            if(peso > 90) {
                peso90Mais = peso90Mais + 1;
            }

            if(idade > 0) {

                idadeTotal = idadeTotal + idade;
            }

            contador++;
        }

        System.out.println("Quantidade de pessoas com mais de 90 quilos: " + peso90Mais);

        double mediaIdades = idadeTotal / 7 ;

        System.out.println("A média das idades das sete pessoas é: " + mediaIdades);

    }
}
