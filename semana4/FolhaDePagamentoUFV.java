package semana4;

public class FolhaDePagamentoUFV {
    private FuncionarioUFV funcionario;
    private float salarioMes;

    public FuncionarioUFV getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioUFV funcionario) {
        this.funcionario = funcionario;
    }

    public float getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(float salarioMes) {
        this.salarioMes = salarioMes;
    }
    
    public void imprimirInformacoes(){
        System.out.println();
    }
}
