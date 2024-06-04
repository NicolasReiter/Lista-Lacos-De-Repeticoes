import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um valor para A: ");
        int valorA = teclado.nextInt();

        System.out.println("Informe um valor para B: ");
        int valorB = teclado.nextInt();

        System.out.println("Informe um valor para C: ");
        int valorC = teclado.nextInt();

        if(valorA > valorB && valorB > valorC) {
            System.out.println(valorC + ", " + valorB + ", " + valorA);
            System.out.println(valorA + ", " + valorB + ", " + valorC);

        } else if(valorA > valorC && valorC > valorB) {
            System.out.println(valorB + ", " + valorC + ", " + valorA);
            System.out.println(valorA + ", " + valorC + ", " + valorB);

        } else if(valorB > valorA && valorA > valorC) {
            System.out.println(valorC + ", " + valorA + ", " + valorB);
            System.out.println(valorB + ", " + valorA + ", " + valorC);

        } else if(valorB > valorC && valorC > valorA) {
            System.out.println(valorA + ", " + valorC + ", " + valorB);
            System.out.println(valorB + ", " + valorC + ", " + valorA);
        } else if(valorC > valorA && valorA > valorB) {
            System.out.println(valorB + ", " + valorA + ", " + valorC);
            System.out.println(valorC + ", " + valorA + ", " + valorB);
        } else if(valorC > valorB && valorB > valorA) {
            System.out.println(valorA + ", " + valorB + ", " + valorC);
            System.out.println(valorC + ", " + valorB + ", " + valorA);
        }


    }


}
