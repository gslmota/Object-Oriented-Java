package semana7;
import java.util.Scanner;
public class PrincipalCartao {
    public static void main(String[] args) {
        String nome;
        CartaoWeb [] cartoes = new CartaoWeb[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do Destinario: ");
        nome = input.next();
        cartoes[0] = new CartaoAniversario(nome);
        System.out.println("Digite o nome do Destinario: ");
        nome = input.next();
        cartoes[1] = new CartaoDiaDosNamorados(nome);
        System.out.println("Digite o nome do Destinario: ");
        nome = input.next();
        cartoes[2] = new CartaoNatal(nome);

        for(int i = 0; i <cartoes.length; i++){
            String remetente;
            System.out.println("\nDigite o nome do remetente da mensagem " + i + " :");
            remetente = input.next();
            System.out.println(cartoes[i].retornarMensagem(remetente));
        }
    }
}
