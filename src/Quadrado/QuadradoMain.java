package Quadrado;

import java.util.Scanner;

public class QuadradoMain {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        
        int lado = sc.nextInt();
        
        Quadrado q = new Quadrado(lado);
        
        System.out.println(q);

    }
}