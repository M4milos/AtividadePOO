package Atividade_Solidos.PinturaPiramide;

import java.util.Scanner;

public class PiramideMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da aresta base da Pirâmide: ");
        double aresta = sc.nextDouble();

        System.out.print("Digite a altura da Pirâmide: ");
        double altura = sc.nextDouble();

        int tipoTinta = 0;

        do {
            System.out.print(Tinta.RetornaTiposDaTinta());

            System.out.print("Digite o tipo da tinta do cone: ");
            tipoTinta = sc.nextInt();

        }while (tipoTinta < 1 || tipoTinta > 3);

        Piramide piramide = new Piramide(aresta, altura, tipoTinta);

        System.out.println(piramide);
    }
}
