package IntervaloNumeros;
import java.util.Scanner;

public class IntervaloNumerosMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        // Verifica se o usuário digitou em ordem inversa
        if (num1 > num2) {
            System.out.println("Os números foram digitados em ordem inversa. Será feita a inversão.");
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        IntervaloNumeros intervalos = new IntervaloNumeros();
        intervalos.setNum1(num1);
        intervalos.setNum2(num2);

        System.out.print(intervalos);

        sc.close();
    }

}
