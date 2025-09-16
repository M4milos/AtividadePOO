package Pessoa;

import java.util.Scanner;

public class PessoaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade da pessoa: ");
        int idade = sc.nextInt();

        System.out.print("Digite a altura da pessoa (em cm): ");
        double altura = sc.nextDouble();

        System.out.print("Digite o peso da pessoa (em kg): ");
        double peso = sc.nextDouble();
        sc.nextLine();

        Pessoa pessoa = new Pessoa(idade, nome, peso, altura);

        boolean sair = false;

        while (!sair) {

            System.out.print("Deseja engordar a pessoa? (S/N): ");
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                System.out.print("Quantos quilos devemos engordar a pessoa? ");
                double quilos = sc.nextDouble();
                sc.nextLine();
                pessoa.Engordar(quilos);
                System.out.println("A pessoa ficou com: " + pessoa.getPeso() + " kg");
            }

            System.out.print("Deseja emagrecer a pessoa? (S/N): ");
            resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                System.out.print("Quantos quilos devemos emagrecer a pessoa? ");
                double quilos = sc.nextDouble();
                sc.nextLine();
                pessoa.Emagrecer(quilos);
                System.out.println("A pessoa ficou com: " + pessoa.getPeso() + " kg");
            }

            System.out.print("Deseja envelhecer a pessoa? (S/N): ");
            resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                pessoa.Envelhecer();
                System.out.println("A pessoa ficou com: " + pessoa.getIdade() + " anos");
            }

            System.out.print("Deseja que a pessoa cresça? (S/N): ");
            resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                System.out.print("Deseja aumentar quantos cm da altura da pessoa? ");
                double alturaCresc = sc.nextDouble();
                sc.nextLine();
                pessoa.Crescer(alturaCresc);
                System.out.println("A pessoa ficou com: " + pessoa.getAltura() + " cm de altura");
            }

            System.out.print("Deseja parar de alterar os dados da pessoa? (S/N): ");
            resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                sair = true;
            }
        }

        System.out.println("\nDados finais da pessoa:");
        System.out.println(pessoa);

        sc.close();
    }
}
