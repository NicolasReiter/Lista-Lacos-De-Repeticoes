public class Exercicio3 {

    public static void main(String[] args) {


        int valor = 1000;

        while(valor <= 2000) {

            int resultado = valor % 11;

            if (resultado == 2) {

                System.out.println(valor);
            }

            valor++;
        }

    }
}
