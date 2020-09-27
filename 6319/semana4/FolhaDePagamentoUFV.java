// Gabriel Sávio de Lima Mota   6319
package semana4;
public class FolhaDePagamentoUFV {
    private FuncionarioUFV funcionario;
    private double salarioMes;
    private Data dataPagamento;
    
    public FuncionarioUFV getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioUFV funcionario) {
        this.funcionario = funcionario;
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(double salarioMes) {
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
        System.out.println("Data de nascimento -> Dia: " + funcionario.getDate().getDia() + " Mês: "+ funcionario.getDate().getMes() + " Ano: " + funcionario.getDate().getAno());
        System.out.println("Salário do mês: " + getSalarioMes());
        System.out.println("Mês de pagamento: " + getDataPagamento().getMes() + " Ano de pagamento: " + getDataPagamento().getAno());
    }

    
}
