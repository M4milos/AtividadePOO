package Atividade_Solidos.PinturaCone;
import java.util.Scanner;

public class ConeMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Raio do cone: ");
        double raio = sc.nextInt();

        System.out.print("Digite a Altura do cone: ");
        double altura = sc.nextInt();

        int tipoTinta = 0;

        do {
            System.out.print(Tinta.RetornaTiposDaTinta());

            System.out.print("Digite o tipo da tinta do cone: ");
            tipoTinta = sc.nextInt();

        }while (tipoTinta < 1 || tipoTinta > 3);

        Cone cone = new Cone(raio, altura, tipoTinta);

        System.out.println(cone);
    }

}
