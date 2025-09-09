package Salario;
import java.util.Scanner;

public class SalarioMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? R$ ");
        double valorHora = sc.nextDouble();

        System.out.print("Quantas horas trabalhou no mês? ");
        int horasMes = sc.nextInt();

        Salario sal =  new Salario();
        sal.setValorHora(valorHora);
        sal.setHorasMes(horasMes);

        System.out.print(sal);

        sc.close();
    }
}
