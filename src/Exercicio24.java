import java.util.Scanner;

public class Exercicio24 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        int primeiroNumero = teclado.nextInt();
        System.out.println("Digite o 2º número");
        int ultimoNumero = teclado.nextInt();

        for (int i = primeiroNumero; i <= ultimoNumero; i++) {
            if( ehPrimo(i) )
                System.out.println(i);
        }
    }

    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}
