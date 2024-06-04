import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 1;

        double quantidade1A10 = 0;
        double peso1A10 = 0;
        double quantidade11A20 = 0;
        double peso11A20 = 0;
        double quantidade21A30 = 0;
        double peso21A30 = 0;
        double quantidade31Mais = 0;
        double peso31Mais = 0;

        while(contador <= 15) {

            System.out.println("Digite a idade da " + contador + "º pessoa: ");
            double idade = teclado.nextInt();
            System.out.println("Digite o peso da " + contador + "º pessoa");
            double peso = teclado.nextInt();



            if(idade >= 1 && idade <= 10) {

                quantidade1A10 = quantidade1A10 + 1;

                peso1A10 = peso1A10 + peso;
            } else if(idade >= 11 && idade <= 20) {

                quantidade11A20 = quantidade11A20 + 1;

                peso11A20 = peso11A20 + peso;
            } else if(idade >= 21 && idade <= 30) {

                quantidade21A30 = quantidade21A30 + 1;

                peso21A30 = peso21A30 + peso;
            } else if(idade >= 31) {

                quantidade31Mais = quantidade31Mais + 1;

                peso31Mais = peso31Mais + peso;
            }

            contador++;
        }

        double media1A10 = peso1A10 / quantidade1A10;

        System.out.println("Idade média do grupo de 1 a 10: " + media1A10);

        double media11A20 = peso11A20 / quantidade11A20;

        System.out.println("Idade média do grupo de 11 a 20: " + media11A20);

        double media21A30 = peso21A30 / quantidade21A30;

        System.out.println("Idade média do grupo de 21 a 30: " + media21A30);

        double media31Mais = peso31Mais / quantidade31Mais;

        System.out.println("Idade média do grupo de mais de 31: " + media31Mais);
    }
}
