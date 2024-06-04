import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean loop = true;

        System.out.println("Escolha qual operação entre dois números desejas:\n " +
                "1.Adição \n 2.Subtração \n 3.Multiplicação \n 4.Divisão \n 7.Sair");

        while(loop == true) {


            int opcao = teclado.nextInt();

            if(opcao == 7) {
                break;
            }else if(opcao == 1) {

                System.out.println("Digite o 1º número: ");
                double numero1 = teclado.nextDouble();
                System.out.println("Digite o 2º número: ");
                double numero2 = teclado.nextDouble();

                double soma = numero1 + numero2;


                System.out.println("Escolha uma das opções: " +
                        "\n 5.Exibir resultado \n 6.Voltar ao menu \n 7.Sair");
                opcao = teclado.nextInt();

                if (opcao == 7) {
                    break;
                }

                if(opcao == 5) {

                    System.out.println("O resultado da soma é " + soma);
                }

                if(opcao == 6) {

                    System.out.println("Escolha qual operação entre dois números desejas:\n " +
                            "1.Adição \n 2.Subtração \n 3.Multiplicação \n 4.Divisão \n 7.Sair");
                }
            } else if(opcao == 2) {

                System.out.println("Digite o 1º número: ");
                double numero1 = teclado.nextDouble();
                System.out.println("Digite o 2º número: ");
                double numero2 = teclado.nextDouble();

                double subtracao = numero1 - numero2;

                System.out.println("Escolha uma das opções: " +
                        "\n 5.Exibir resultado \n 6.Voltar ao menu \n 7.Sair");
                opcao = teclado.nextInt();

                if (opcao == 7) {
                    break;
                }

                if(opcao == 5) {

                    System.out.println("O resultado da subtração é " + subtracao);
                }

                if(opcao == 6) {

                    System.out.println("Escolha qual operação entre dois números desejas:\n " +
                            "1.Adição \n 2.Subtração \n 3.Multiplicação \n 4.Divisão \n 7.Sair");
                }
            } else if(opcao == 3) {

                System.out.println("Digite o 1º número: ");
                double numero1 = teclado.nextDouble();
                System.out.println("Digite o 2º número: ");
                double numero2 = teclado.nextDouble();

                double multiplicacao = numero1 * numero2;

                System.out.println("Escolha uma das opções: " +
                        "\n 5.Exibir resultado \n 6.Voltar ao menu \n 7.Sair");
                opcao = teclado.nextInt();

                if (opcao == 7) {
                    break;
                }

                if(opcao == 5) {

                    System.out.println("O resultado da multiplicação é " + multiplicacao);
                }

                if(opcao == 6) {

                    System.out.println("Escolha qual operação entre dois números desejas:\n " +
                            "1.Adição \n 2.Subtração \n 3.Multiplicação \n 4.Divisão \n 7.Sair");
                }
            } else if(opcao == 4) {

                System.out.println("Digite o 1º número: ");
                double numero1 = teclado.nextDouble();
                System.out.println("Digite o 2º número: ");
                double numero2 = teclado.nextDouble();

                double divisao = numero1 / numero2;

                System.out.println("Escolha uma das opções: " +
                        "\n 5.Exibir resultado \n 6.Voltar ao menu \n 7.Sair");
                opcao = teclado.nextInt();

                if (opcao == 7) {
                    break;
                }

                if(opcao == 5) {

                    System.out.println("O resultado da divisão é " + divisao);
                }

                if(opcao == 6) {

                    System.out.println("Escolha qual operação entre dois números desejas:\n " +
                            "1.Adição \n 2.Subtração \n 3.Multiplicação \n 4.Divisão \n 7.Sair");
                }
            } else if(opcao == 6) {

                System.out.println("Escolha qual operação entre dois números desejas:\n " +
                        "1.Adição \n 2.Subtração \n 3.Multiplicação \n 4.Divisão \n 7.Sair");
            }

        }
    }
}
