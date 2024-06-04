import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int maiorDe18 = 0;
        int contador  = 1;

        while (contador <= 10) {

            System.out.println("Digite o nome da " + contador + "º pessoa");
            String nome = teclado.next();
            System.out.println("Digite a idade do(a) " + nome);
            int idade = teclado.nextInt();

            if(idade >= 18) {
                maiorDe18 = maiorDe18 + 1;
            }

            contador++;
        }

        System.out.println("Quantidade de pessoas maiores de 18 anos de idade: " + maiorDe18);
    }
}
