import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean loop = true;

        double somaTotal = 0;
        double somaPositivo = 0;
        double somaNegativo = 0;

        while(loop == true) {


            System.out.println("Digite números positivos ou negativos para uma lista: ");
            double numero = teclado.nextDouble();

            if(numero == 0) {

                break;
            } else if(numero > 0) {

                somaPositivo += numero;
            } else if(numero < 0) {

                somaNegativo += numero;
            }

            somaTotal += numero;
        }

        System.out.println("Soma positivos: " + somaPositivo);
        System.out.println("Soma negativos: " + somaNegativo);
        System.out.println("Soma total: " + somaTotal);
    }
}
