// Gabriel Sávio de Lima Mota
package semana2;
public class Pessoa {
    // Atributos
    int anoNascimento;
    String mesNascimento;
    int diaNascimento;

    // Método para armazenar
    public void armazenarIdade(int anoNascimento, String mesNascimento, int diaNascimento) {
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
