package semana6;
public class FuncionarioMensalista extends Funcionario{
    private double salarioMensal;

    public FuncionarioMensalista(String nome, int matricula, double salarioMensal) {
        super(nome, matricula);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public void imprimir(){
        super.imprimir();
        System.out.printf("\n O sálario Mensal do Funcionario %s é %f .\n", this.nome, this.salarioMensal);
    }

    public double calcularSalarioFinal(sa)
}
