// Gabriel Sávio de Lima Mota   6319
package semana6;
public class Funcionario {
    protected String nome;
    protected int matricula;
    
    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void imprimir(){
        System.out.println("O nome do funcionário é: " + this.nome);
        System.out.println("A matrícula do funcionário é: " + this.matricula);
    }

    public double calcularSalarioFinal(){
        return 0.0;
    }
}
