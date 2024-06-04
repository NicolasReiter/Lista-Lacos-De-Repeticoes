import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean loop = true;

        while(loop == true) {

            System.out.println("Menu de opções:" + "\n"
                    + "1.Novo salário" + "\n"
                    + "2.Férias" + "\n"
                    + "3.Décimo terceiro" + "\n"
                    + "4.Sair");
            double opcao = teclado.nextDouble();

            if(opcao < 1 || opcao > 4) {

                System.out.println("Opção inválida");
            } else if(opcao == 4) {

                break;
            } else if(opcao == 1) {

                System.out.println("Informe o salário do funcionario: ");
                double salario = teclado.nextDouble();

                if(salario <= 350) {

                    salario = salario + (0.15 * salario);
                } else if(salario > 350 && salario <= 600) {

                    salario = salario + (0.10 * salario);
                } else if(salario > 600) {

                    salario = salario + (0.05 * salario);
                }

                System.out.println("Valor reajustado do salário: R$" + salario);
            } else if(opcao == 2) {

                System.out.println("Informe o salário do funcionario: ");
                double salario = teclado.nextDouble();
                System.out.println("Digite quantos dias ficou de férias: ");
                double ferias = teclado.nextDouble();

                salario =  salario + (salario / ferias);

                System.out.println("Valor das férias: R$" + salario);
            } else if(opcao == 3) {

                System.out.println("Informe o salário do funcionario: ");
                double salario = teclado.nextDouble();
                System.out.println("Digite quantos meses de trabalho na empresa: ");
                double meses = teclado.nextDouble();

                if(meses >= 1 && meses <= 12) {

                    salario = (salario * meses) / 12;
                    System.out.println("Valor do décimo terceiro: R$" + salario);
                } else if(meses > 12) {

                    meses = 12;

                    salario = (salario * meses) / 12;
                    System.out.println("Valor do décimo terceiro: R$" + salario);
                }
            }
        }
    }
}
