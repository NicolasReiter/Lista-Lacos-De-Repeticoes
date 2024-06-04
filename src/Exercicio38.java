import java.util.Scanner;

public class Exercicio38 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Eschola uma das opções: " + "\n" + "1.Média aritmética" + "\n" + "2.Média ponderada" + "\n" + "3.Sair");
        double opcao = teclado.nextDouble();

         if(opcao == 1) {

            System.out.println("Digite a 1º nota: ");
            double nota1 = teclado.nextDouble();
            System.out.println("Digite a 2º nota: ");
            double nota2 = teclado.nextDouble();

            double mediaAritmetica = (nota1 + nota2) / 2;

            System.out.println("A média aritmética foi: " + mediaAritmetica);
        } else if(opcao == 2) {

             System.out.println("Digite a 1º nota: ");
             double nota1 = teclado.nextDouble();
             System.out.println("Digite o peso da 1º nota: ");
             double peso1 = teclado.nextDouble();
             System.out.println("Digite a 2º nota: ");
             double nota2 = teclado.nextDouble();
             System.out.println("Digite  o peso da 2º nota: ");
             double peso2 = teclado.nextDouble();
             System.out.println("Digite a 3º nota: ");
             double nota3 = teclado.nextDouble();
             System.out.println("Digite a o peso da 3º nota: ");
             double peso3 = teclado.nextDouble();

             double mediaPonderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / 3;

             System.out.println("A média ponderada foi: " + mediaPonderada);
        } else if(opcao == 3) {

             System.out.println("Programa cancelado");
         } else {

             System.out.println("Opção inválida");
         }
    }
}
