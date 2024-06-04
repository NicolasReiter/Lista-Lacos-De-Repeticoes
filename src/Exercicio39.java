import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean loop = true;

        double quantidade1 = 0;
        double quantidade2 = 0;
        double quantidade3 = 0;
        double quantidade4 = 0;
        double quantidadeNulo = 0;
        double quantidadeBranco = 0;
        double votosTotal = 0;

        while(loop == true) {


            System.out.println("Escolha seu voto:" + "\n"
                    + "1, 2, 3, 4            Votos para os respectivos candidatos" + "\n"
                    + "5                     Voto nulo" + "\n"
                    + "6                     Voto em branco");
            double voto = teclado.nextDouble();

            if(voto == 0) {

                break;
            }
            if(voto == 1) {

                quantidade1 += 1;
            } else if(voto == 2) {

                quantidade2 += 1;
            } else if(voto == 3) {

                quantidade3 += 1;
            } else if(voto == 4) {

                quantidade4 += 1;
            } else if(voto == 5) {

                quantidadeNulo += 1;
            } else if(voto == 6) {

                quantidadeBranco += 1;
            }

            votosTotal += 1;
        }

        System.out.println("Total de votos do candidato 1: " + quantidade1 + "\n"
                         + "Total de votos do candidato 2: " + quantidade2 + "\n"
                         + "Total de votos do candidato 3: " + quantidade3 + "\n"
                         + "Total de votos do candidato 4: " + quantidade4 + "\n"
                         + "Total de votos nulos: " + quantidadeNulo + "\n"
                         + "Total de votos em branco: " + quantidadeBranco);

        double porcentagemNulos = (quantidadeNulo * 100) / votosTotal;
        System.out.println("Porcentagem de votos nulos sobre o total de votos: " + porcentagemNulos + "%");

        double porcentagemBranco = (quantidadeBranco * 100) / votosTotal;
        System.out.println("Porcentagem de votos em branco sobre o total de votos: " + porcentagemBranco + "%");
    }
}
