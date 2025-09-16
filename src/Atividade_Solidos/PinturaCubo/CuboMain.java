package Atividade_Solidos.PinturaCubo;

import java.util.Scanner;

public class CuboMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da aresta do cubo: ");
        double aresta = sc.nextInt();

        int tipoTinta = 0;

        do {
            System.out.print(Tinta.RetornaTiposDaTinta());

            System.out.print("Digite o tipo da tinta do cone: ");
            tipoTinta = sc.nextInt();

        }while (tipoTinta < 1 || tipoTinta > 3);

        System.out.print("Digite o rendimento da tinta: ");
        double rendimento = sc.nextInt();

        Cubo cubo = new Cubo(aresta, tipoTinta, rendimento);

        System.out.println(cubo);
    }
}
