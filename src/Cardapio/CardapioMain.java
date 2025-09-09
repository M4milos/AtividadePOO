package Cardapio;

import java.util.Scanner;

public class CardapioMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cardapio cardapio = new Cardapio();

        cardapio.mostrarMenu();
        boolean continuar = true;

        while (continuar) {

            System.out.print("\nDigite o código do item: ");
            int codigo = sc.nextInt();

            if (codigo == 0) {
                break; // encerra o pedido
            }

            cardapio.setCodigo(codigo);
            double preco = cardapio.obterPreco();

            if (preco == -1) {
                System.out.println("Código inválido! Tente novamente.");
                continue;
            }

            System.out.print("Digite a quantidade: ");
            int quantidade = sc.nextInt();

            cardapio.setQuantidade(quantidade);
            cardapio.setSubtotal(preco);

            System.out.printf("Item adicionado! Subtotal: R$ %.2f%n", cardapio.getSubtotal());

            System.out.print("Deseja adicionar outro item? (S/N): ");
            sc.nextLine();
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        System.out.printf("\nTotal geral do pedido: R$ %.2f%n", cardapio.getTotalGeral());
        sc.close();
    }
}
