import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        int quantidade = 0;
        double totalIdade = 0;
        boolean botao = true;

        while (botao == true) {

            System.out.println("Digite a idade da pessoa: ");
            double idade = teclado.nextDouble();

            if(idade == 0) {
                botao = false;
            }

            totalIdade= totalIdade + idade;

            quantidade += 1;
        }

        System.out.println("A média das idades é " + (totalIdade / quantidade));
    }
}
