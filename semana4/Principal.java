package semana4;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        FolhaDePagamentoUFV [] dados = new FolhaDePagamentoUFV [3];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < dados.length; i ++){
            dados [i] = new FolhaDePagamentoUFV();
            System.out.println("Digite o nome: ");
            String nome= input.nextLine();
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
            String cargo = input.nextLine();
            FuncionarioUFV funcionario = new FuncionarioUFV(nome, matricula, data, );
            dados[i].setFuncionario(funcionario);

        }

    }
}
