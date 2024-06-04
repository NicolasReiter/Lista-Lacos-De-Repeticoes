import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean loop = true;

        double quantidade50Mais = 0;
        double altura50Mais = 0;

        while(loop == true) {


            System.out.println("Digite a idade da pessoa: ");
            double idade = teclado.nextDouble();

            if(idade <= 0) {
                break;
            }
            System.out.println("Digite a altura da pessoa: ");
            double altura = teclado.nextDouble();

            if(idade > 50) {

                quantidade50Mais += 1;

                altura50Mais += altura;
            }
        }

        double mediaAltura50Mais = altura50Mais / quantidade50Mais;

        System.out.println("Média das alturas das pessoas com mais de 50 anos: " + mediaAltura50Mais);
    }
}
