package semana4;
public class FuncionarioUFV {
    // atributos
    private String nome;
    private int matricula;
    private Data data;
    private String cargo;

    public FuncionarioUFV(String nome, int matricula, Data data, String cargo) {
        this.nome = nome;
        this.matricula = matricula;
        this.data = data;
        this.cargo = cargo;
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

    public Data getDate() {
        return data;
    }

    public void setDate(Data data) {
        this.data = data;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}