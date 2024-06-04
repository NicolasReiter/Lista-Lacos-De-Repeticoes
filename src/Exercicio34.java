import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean botao = true;

        double menosSalario = 1000000000;
        double menosIdade = 200;
        double maiorIdade = 0;
        double salarioTotal = 0;
        double quantidadeMulher200 = 0;
        double quantidade = 0;
        double idadeMenorSalario = 0;
        String sexoMenorSalario = null;

        while (botao == true) {

            System.out.println("Digite a idade da pessoa: ");
            double idade = teclado.nextDouble();

            if (idade < 0) {

                break;
            } else {

                System.out.println("Digite o sexo(H - Homem, M - Mulher) da pessoa: ");
                String sexo = teclado.next().toUpperCase();
                System.out.println("Digite o salário da pessoa: ");
                double salario = teclado.nextDouble();

                salarioTotal = salarioTotal + salario;

                if (sexo.equals("M") && salario < 200) {

                    quantidadeMulher200 = quantidadeMulher200 + 1;
                }

                if (idade > maiorIdade) {

                    maiorIdade = idade;
                }

                if (idade < menosIdade) {

                    menosIdade = idade;
                }

                if (salario < menosSalario) {

                    menosSalario = salario;
                    idadeMenorSalario = idade;
                    sexoMenorSalario = sexo;
                }

                quantidade += 1;
            }
        }

        double mediaSalarios = salarioTotal / quantidade;

        System.out.println("Média dos salários do grupo: " + mediaSalarios);
        System.out.println("Maior idade do grupo: " + maiorIdade + ", Menor idade do grupo: " + menosIdade);
        System.out.println("Quantidade de mulheres com salário até R$ 200,00: " + quantidadeMulher200);
        System.out.println("Idade e sexo da pessoas que possui o menor salário: " + idadeMenorSalario + ", " + sexoMenorSalario);
    }
}
