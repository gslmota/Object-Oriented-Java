// Gabriel Sávio de Lima Mota   6319
//Implemente um programa em Java que leia um número inteiro e verifique se ele é par ou ímpar.
package semana1;
import java.util.Scanner;
public class VerificaParImpar {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = num.nextInt();
        if(numero % 2 == 0){
            System.out.println("O número " + numero + " é par!" );
        } else {
            System.out.println("O número " + numero + " é ímpar!" );
        }
    }
}