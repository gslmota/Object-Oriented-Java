package semana11;
import java.util.InputMismatchException;
import java.util.Scanner;
public class RaizFuncao {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            double a, b, c;
            System.out.println("Equação do 2o grau: Ax² + Bx + Cx = 0");
            System.out.println("Digite o valor de A na equação: ");
            a = input.nextDouble();
            if(a == 0)
            {
                throw new Exception("O valor de A na equação não pode ser zero!");
            }
            System.out.println("Digite o valor de B na equação: ");
            b = input.nextDouble();
            System.out.println("Digite o valor de C na equação: ");
            c = input.nextDouble();
            double delta = 0;
            delta = (b*b) - (4 * a * c);
            double raiz1 = 0, raiz2 = 0;
            double vB = b * (-1);
            double rdelta = 0;
            rdelta = Math.sqrt(delta);
            raiz1 = (vB + rdelta) / 2*a;
            raiz2 = (vB - rdelta) / 2*a;
            System.out.println("A raiz 1 da equação é: " + raiz1);
            System.out.println("A raiz 2 da equação é : " + raiz2);
        } catch(InputMismatchException e) {
            System.err.println(e);
            System.out.println("ERRO! Entre com um valor inteiro!");
        } catch(Exception ex){
            System.err.println(ex);
            System.out.println("Digite um valor valido para o A");
        }
    }
}
