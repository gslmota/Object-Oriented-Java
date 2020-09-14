//  Gabriel Sávio de Lima Mota
package oo;
import java.util.Scanner;
public class PrincipalPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Scanner input = new Scanner(System.in);
        // Cadastro da pessoa 1
        System.out.println("Digite o ano de nascimento da Pessoa 1: ");
        pessoa1.anoNascimento = input.nextInt();
        System.out.println("Digite o mês de nascimento da Pessoa 1: ");
        pessoa1.mesNascimento = input.next();
        System.out.println("Digite o dia de nascimento da Pessoa 1: ");
        pessoa1.diaNascimento = input.nextInt();
        pessoa1.armazenarIdade(pessoa1.anoNascimento, pessoa1.mesNascimento, pessoa1.diaNascimento);
        // Cadastro da pessoa 2
        System.out.println("Digite o ano de nascimento da Pessoa 2: ");
        pessoa2.anoNascimento = input.nextInt();
        System.out.println("Digite o mês de nascimento da Pessoa 2: ");
        pessoa2.mesNascimento = input.next();
        System.out.println("Digite o dia de nascimento da Pessoa 2: ");
        pessoa2.diaNascimento = input.nextInt();
        pessoa2.armazenarIdade(pessoa2.anoNascimento, pessoa2.mesNascimento, pessoa2.diaNascimento);
        
        // Imprime os dados
        System.out.println("Dados da pessoa 1");
        pessoa1.imprimirIdade();
        System.out.println("Dados da pessoa 2");
        pessoa2.imprimirIdade();
    }
}
