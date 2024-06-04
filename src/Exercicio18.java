import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 1;

        double idade50Peso60 = 0;
        double altura150Menos = 0;
        double idades150Total = 0;
        double quantidadeOlhoAzul = 0;
        double ruivoNaoAzul = 0;

        while (contador <= 20) {

            System.out.println("Digite a idade da " + contador + "º pessoa: ");
            double idade = teclado.nextDouble();
            System.out.println("Digite o peso da " + contador + "º pessoa: ");
            double peso = teclado.nextDouble();
            System.out.println("Digite a altura da " + contador + "º pessoa: ");
            double altura = teclado.nextDouble();
            System.out.println("Digite qual a cor dos olhos(A – Azul, P- Preto, V- Verde e C- Castanho) da " + contador + "º pessoa: ");
            String olhos = teclado.next().toUpperCase();
            System.out.println("Digite qual a cor do cabelo(P – Preto, C- Castanho, L – Louro e R-Ruivo) da " + contador + "º pessoa: ");
            String cabelo = teclado.next().toUpperCase();

            if(idade > 50 &&peso < 60) {

                idade50Peso60 = idade50Peso60 + 1;
            } else if(altura < 1.5) {
                altura150Menos = altura150Menos + 1;

                idades150Total += idade;
            } else if(olhos.equals("A")) {

                quantidadeOlhoAzul = quantidadeOlhoAzul + 1;
            } else if(cabelo.equals("R") && !olhos.equals("A")) {

                ruivoNaoAzul = ruivoNaoAzul + 1;
            }

            contador++;
        }

        System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos: " + idade50Peso60);

        double mediaIdadesMenor150 = idades150Total / altura150Menos;

        System.out.println("Média das idades das pessoas com altura inferior a 1,50: " + mediaIdadesMenor150);

        double percentual = (quantidadeOlhoAzul * 100) / 20 ;

        System.out.println("Porcentagem de pessoas com olhos azuis entre as pessoas analisadas: " + percentual + "%");

        System.out.println("Quantidade de pessoas ruivas que não possuem olhos azuis: " + ruivoNaoAzul);

    }
}
