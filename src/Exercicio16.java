import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 1;

        double idade50Mais = 0;
        double altura10A20 = 0;
        double totalAltura10A20 = 0;
        double peso40Menos = 0;

        while (contador <= 25) {

            System.out.println("Digite a idade da " + contador + "º pessoa: ");
            double idade = teclado.nextDouble();
            System.out.println("Digite a altura da " + contador + "º pessoa: ");
            double altura = teclado.nextDouble();
            System.out.println("Digite o peso da " + contador + "º pessoa: ");
            double peso = teclado.nextDouble();

            if(idade > 50) {
                idade50Mais = idade50Mais + 1;
            } else if(idade >= 10 && idade <= 20) {
                altura10A20 = altura10A20 + 1;

                totalAltura10A20 = totalAltura10A20 + altura;
            } else if(peso < 40) {
                peso40Menos = peso40Menos + 1;
            }

            contador++;
        }

        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + idade50Mais);

        double mediaAlturas10A20 = totalAltura10A20 / altura10A20;

        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturas10A20);

        double percentual = (peso40Menos * 100) / 25 ;

        System.out.println("Porcentagem das pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas: " + percentual + "%");
    }
}
