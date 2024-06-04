import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int ate15 = 0;
        int de16A30 = 0;
        int de31A45 = 0;
        int de46A60 = 0;
        int acima61 = 0;
        int contador  = 1;

        while (contador <= 15) {

            System.out.println("Digite o nome da " + contador + "º pessoa");
            String nome = teclado.next();
            System.out.println("Digite a idade do(a) " + nome);
            double idade = teclado.nextDouble();

            if(idade <= 15) {
                ate15 = ate15 + 1;
            } else if(idade >= 16 && idade <= 30) {
                de16A30 = de16A30 + 1;
            } else if(idade >= 31 && idade <= 45) {
                de31A45 = de31A45 + 1;
            } else if(idade >= 46 && idade <= 60) {
                de46A60 = de46A60 + 1;
            } else if(idade >= 61) {
                acima61 = acima61 + 1;
            }

            contador++;
        }

        System.out.println("Quantidade de pessoas com até 15 anos de idade: " + ate15);
        System.out.println("Quantidade de pessoas entre 16 anos a 30 anos: " + de16A30);
        System.out.println("Quantidade de pessoas entre 31 anos a 45 anos: " + de31A45);
        System.out.println("Quantidade de pessoas entre 46 anos a 60 anos: " + de46A60);
        System.out.println("Quantidade de pessoas acima de 61 anos de idade: " + acima61);

        double primeiraEUltimaFaixa = ate15 + acima61;

        double percentual = (primeiraEUltimaFaixa * 100) / 15 ;

        System.out.println("Percentual de pessoas na primeira e na última faixa etária, com relação ao total de pessoas: " + percentual + "%");
    }
}
