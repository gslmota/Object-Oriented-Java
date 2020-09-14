package oo;

import java.util.Scanner;

public class MatematicaPrincipal {
    public static void main(String[] args) {
        Matematica numero1 = new Matematica();
        Matematica numero2 = new Matematica();
        Matematica numero3 = new Matematica();
        Scanner input = new Scanner(System.in);
        // Validar a Soma
        System.out.println("Digite 2 numeros: ");
        numero1.n1 = input.nextInt();
        numero1.n2 = input.nextInt();
        System.out.println( "A soma é " + numero1.soma(numero1.n1, numero1.n2));

        // Validar Ímpar
        System
    }
}
