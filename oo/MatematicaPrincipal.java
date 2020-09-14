//  Gabriel Sávio de Lima Mota 6319
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

        // Validar VerificaÍmpar
        System.out.println("Digite um número: ");
        numero2.n1 = input.nextInt();
        boolean valor = numero2.verificaImpar(numero2.n1);
        if(valor == true){
            System.out.println("O número " + numero2.n1 + " é primo");
        } else {
            System.out.println("O número " + numero2.n1 + " não é primo");
        }

        // Validar VErificaQuadrado
        System.out.println("Digite um número: ");
        numero3.n1 = input.nextInt();
        System.out.println("O número " + numero3.n1 + " tem como seu quadrado: " + numero3.calculaQuadrado(numero3.n1));
    }
}
