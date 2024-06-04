
public class Exercicio2 {

    public static void main(String[] args) {

        int valor = 1;

        int contador;
        while(valor <= 10){
            for(contador = 0; contador <= 10; contador++) {

                int resultado = valor * contador;

                System.out.println( valor + "x" + contador + "=" + resultado);


            }
            valor++;
            System.out.println("\n");
            }
    }
}
