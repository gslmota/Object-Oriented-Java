package semana4;

public class FolhaDePagamentoUFV {
    private FuncionarioUFV funcionario;
    private int mesPagamento, anoPagamento;
    private float salarioMes;

    public FuncionarioUFV getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioUFV funcionario) {
        this.funcionario = funcionario;
    }

    public int getMesPagamento() {
        return mesPagamento;
    }

    public void setMesPagamento(int mesPagamento) {
        this.mesPagamento = mesPagamento;
    }

    public int getAnoPagamento() {
        return anoPagamento;
    }

    public void setAnoPagamento(int anoPagamento) {
        this.anoPagamento = anoPagamento;
    }

    public float getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(float salarioMes) {
        this.salarioMes = salarioMes;
    }
    
}
