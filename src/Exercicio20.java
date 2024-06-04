import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 1;

        double idadeTotal = 0;
        double peso90altura150 = 0;
        double altura190Mais = 0;
        double idade10A30altura190Mais = 0;

        while (contador <= 10) {

            System.out.println("Digite a idade da " + contador + "º pessoa: ");
            double idade = teclado.nextDouble();
            System.out.println("Digite o peso da " + contador + "º pessoa: ");
            double peso = teclado.nextDouble();
            System.out.println("Digite a altura da " + contador + "º pessoa: ");
            double altura = teclado.nextDouble();

            if(peso > 90 && altura < 1.5) {

                peso90altura150 = peso90altura150 + 1;
            } else if(altura > 1.9) {

                altura190Mais = altura190Mais + 1;
            } else if(idade > 10 && idade < 30 && altura > 1.9) {

                idade10A30altura190Mais = idade10A30altura190Mais + 1;
            }

            if(idade > 0) {

                idadeTotal = idadeTotal + idade;
            }

            contador++;
        }

        double mediaIdades = idadeTotal / 10;

        System.out.println("A média das idades das sete pessoas é: " + mediaIdades);

        System.out.println("Quantidade de pessoas com peso superior a 90 quilos e altura inferior a 1,50: " + peso90altura150);

        double percentual = (idade10A30altura190Mais * 100) / altura190Mais ;

        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90: " + percentual + "%");
    }
}
