//  Gabriel Sávio de Lima Mota
package oo;

import java.util.Scanner;

public class PrincipalPessoa {
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[2];
        int anoNasc;
        int mesNasc;
        int diaNasc;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 2; i++){
            System.out.println("Digite o ano de nascimento da pessoa " + i);
            anoNasc = input.nextInt();
            System.out.println("Digite o mês de nascimento da pessoa " + i);
            mesNasc = input.nextInt();
            System.out.println("Digite o dia de nascimento da pessoa " + i);
            diaNasc = input.nextInt();
            pessoa[i].armazenarIdade(anoNasc, mesNasc, diaNasc);
        }

        for(int i = 0; i < 2; i++){
            pessoa[i].imprimirIdade();
        }
    }
}
