package semana6;

public class Principal {
    //Numero 5 lista
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Lucas", 222);
        FuncionarioMensalista fm = new FuncionarioMensalista("Pedro", 444, 2500);
        FuncionarioHorista fh = new FuncionarioHorista("João", 545, 20, 15);

        f.imprimir();
        System.out.println("O salario final do funcionario " + f.getNome() + " é : " + f.calcularSalarioFinal());

        fm.imprimir();
        System.out.println("O salario final do funcionario " + fm.getNome() + " é : " + fm.calcularSalarioFinal());

        fh.imprimir();
        System.out.println("O salario final do funcionario " + fh.getNome() + " é : " + fh.calcularSalarioFinal());

    }
    
    /*
    Número 6 lista
    public static void main(String[] args) {
        
        FuncionarioMensalista [] vfm = new FuncionarioMensalista[150];
        FuncionarioHorista [] vfh = new FuncionarioHorista[150];
        for(int i = 0; i<= 150; i++){
            vfm[i].imprimir();
            System.out.println("O salario final do funcionario " + vfm[i].getNome() + " é : " + vfm[i].calcularSalarioFinal());

            vfh[i].imprimir();
            System.out.println("O salario final do funcionario " + vfh[i].getNome() + " é : " + vfh[i].calcularSalarioFinal());
        }
    }
    */
    // teste
}
