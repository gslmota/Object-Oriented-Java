package semana4;
public class FolhaDePagamentoUFV {
    private FuncionarioUFV funcionario;
    private float salarioMes;
    private Data dataPagamento;
    
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
    
    public Data getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Data dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    public void imprimirInformacoes(){
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Data de nascimento -> Dia: " + funcionario.getDate().getDia() + "Mês: "+ funcionario.getDate().getMes() + "Ano: " + funcionario.getDate().getAno());
        System.out.println("Salário do mês: " + getSalarioMes());
        System.out.println("Dia de pagamento: " + getDataPagamento().getDia());
        System.out.println("Mês de pagamento: " + getDataPagamento().getMes());
    }

    
}
