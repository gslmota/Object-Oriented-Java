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
        // imprimir informações
    }
}
