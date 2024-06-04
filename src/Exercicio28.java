import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 1;

        double quantidadeSim = 0;
        double quantidadeNao = 0;
        double quantidadeMulherSim = 0;
        double quantidadeHomem = 0;
        double quantidadeHomemNao = 0;

        while (contador <= 10) {

            System.out.println("Digite o sexo(H - Homem ou M - Mulher) da " + contador + "º pessoa: ");
            String sexo = teclado.next().toUpperCase();
            System.out.println("Digite a sua resposta (S – Sim ou N – Não): ");
            String resposta = teclado.next().toUpperCase();

            if (resposta.equals("S")) {

                quantidadeSim = quantidadeSim + 1;
            }

            if(resposta.equals("N")) {

                quantidadeNao = quantidadeNao + 1;
            }

            if (sexo.equals("M") && resposta.equals("S")) {

                quantidadeMulherSim = quantidadeMulherSim + 1;
            }

            if(sexo.equals("H")) {

                quantidadeHomem = quantidadeHomem + 1;
            }

            if(sexo.equals("H") && resposta.equals("N")) {

                quantidadeHomemNao = quantidadeHomemNao + 1;
            }

            contador++;
        }

        System.out.println("Número de pessoas que respondeu sim: " + quantidadeSim);
        System.out.println("Número de pessoas que respondeu não: " + quantidadeNao);
        System.out.println("Número de mulheres que respondeu sim: " + quantidadeMulherSim);

        double percentual = (quantidadeHomemNao * 100) / quantidadeHomem;

        System.out.println("Percentagem de homens que respondeu não entre todos os homens analisados: " + percentual + "%");
    }
}
