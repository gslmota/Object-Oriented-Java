package semana6;
public class FuncionarioHorista extends Funcionario{
    
    private int horasTrabalhadas, valorHora;

    public FuncionarioHorista(String nome, int matricula, int horasTrabalhadas, int valorHora) {
        super(nome, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public void imprimir(){
        super.imprimir();
        System.out.printf("\n O valor por hora  do Funcionario %s é %d e o valor total de horas trabalhadas é %d.\n", this.nome, this.valorHora, this.horasTrabalhadas);
    }

    public double calcularSalarioFinal(){
        return this.horasTrabalhadas * this.valorHora;
    }
}
