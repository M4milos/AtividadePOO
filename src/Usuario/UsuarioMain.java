package Usuario;
import java.util.Scanner;

public class UsuarioMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();

        Usuario us = new Usuario(nome.trim(), sobrenome.trim());

        System.out.println(us);

        sc.close();
    }

}
