// Gabriel Sávio de Lima Mota
package oo;
public class Pessoa {
    /*Implemente uma classe Java para armazenar e imprimir a data de nascimento de
    uma pessoa. Na sequência, crie duas instâncias dessa classe para validar as
    operações de armazenar e imprimir.*/
    // Atributos
    int anoNascimento;
    int mesNascimento;
    int diaNascimento;

    // Método para armazenar
    public void armazenarIdade(int anoNascimento, int mesNascimento, int diaNascimento) {
        this.anoNascimento = anoNascimento;
        this.mesNascimento = mesNascimento;
        this.diaNascimento = diaNascimento;
    }
    // Método para imprimir
    public void imprimirIdade(){
        System.out.println("Ano de Nascimento: " + this.anoNascimento);
        System.out.println("Mês de Nascimento: " + this.mesNascimento);
        System.out.println("Dia de Nascimento: " + this.diaNascimento);
    }
}
