package OperacoesBasicasNumeros;
import java.util.Scanner;

public class OperacoesBasicasNumerosMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = sc.nextInt();

        if(num1 < num2){
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }

        OperacoesBasicasNumeros operacoes =  new OperacoesBasicasNumeros();
        operacoes.setNum1(num1);
        operacoes.setNum2(num2);
        System.out.print(operacoes);

        sc.close();
    }

}
