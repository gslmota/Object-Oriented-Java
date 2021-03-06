// Gabriel Sávio de Lima Mota   6319
package semana4;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        FolhaDePagamentoUFV [] dados = new FolhaDePagamentoUFV [3];
        Scanner input = new Scanner(System.in);
        // Colentando os dados
        for(int i = 0; i < dados.length; i ++){
            dados [i] = new FolhaDePagamentoUFV();
            System.out.println("Digite o nome: ");
            String nome = input.next();
            System.out.println("Digite a matricula: ");
            int matricula = input.nextInt();
            System.out.println("Digite o dia de nascimento: ");
            int dia  = input.nextInt();
            System.out.println("Digite o mês de nascimento: ");
            int mes = input.nextInt();
            System.out.println("Digite o ano de nascimento: ");
            int ano = input.nextInt();
            Data data = new Data(dia, mes, ano);
            System.out.println("Digite o seu cargo");
            String cargo = input.next();
            FuncionarioUFV funcionario = new FuncionarioUFV(nome, matricula, data, cargo);
            dados[i].setFuncionario(funcionario);
            System.out.println("Digite seu sálario mês: ");
            dados[i].setSalarioMes(input.nextDouble());
            System.out.println("Digite o mês de pagamento: ");
            dados[i].setDataPagamento(new Data(mes, ano));
            dados[i].getDataPagamento().setMes(input.nextInt());
            System.out.println("Digite o ano de pagamento: ");
            dados[i].getDataPagamento().setAno(input.nextInt());
        }

        // Imprimindo os dados
        for(int j = 0; j < 3; j ++){
            System.out.println("Folha de pagamento: " + j);
            dados[j].imprimirInformacoes();
        }
    }
}
