//Implemente um programa em Java que leia o nome e a nota do Enem de três alunos e imprima na tela a nota e nome do aluno com menor nota.
package exercicios;
import java.util.Scanner;
public class Enem {
    public static void main(String args[]){
        String nome1, nome2, nome3;
        Float nota1, nota2, nota3;
        Scanner input = new Scanner(System.in)
        System.out.println("Digite o nome do aluno 1, depois do aluno 2 e do aluno 3 em sequência: ");
        nome1 = input.nextLine();
        nome2 = input.nextLine();
        nome3 = input.nextLine();
        System.out.println("Digite agora as notas do aluno 1, depois do aluno 2 e do aluno 3 em sequência: ");
        nota1 = input.nextFloat();
        nota2 = input.nextFloat();
        nota3 = input.nextFloat();
        if(nota1>nota2 && nota1>nota3){
            if(nota2>nota3){
                System.out.println("O Aluno " + nome3 + " possui a menor nota. Nota: " + nota3);
            } else {
                System.out.println("O Aluno " + nome2 + " possui a menor nota. Nota: " + nota2);
            }
        }else if(nota2>nota1 && nota2>nota3) {
            if(nota3>nota1){
                System.out.println("O Aluno " + nome1 + " possui a menor nota. Nota: " + nota1);
            } else{
                System.out.println("O Aluno " + nome3 + " possui a menor nota. Nota: " + nota3);
            }
        } else{
            if(nota1>nota2){
                System.out.println("O Aluno " + nome2 + " possui a menor nota. Nota: " + nota2);
            } else{
                System.out.println("O Aluno " + nome1 + " possui a menor nota. Nota: " + nota1);
            }
        }
    }
}
