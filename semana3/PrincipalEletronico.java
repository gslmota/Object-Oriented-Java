// Gabriel Sávio de lima Mota   6319
package semana3;
public class PrincipalEletronico {
    public static void main(String[] args) {
        // Validando os Construtores da Classe Eletrônico
        Eletronico eletronic1 = new Eletronico("verde", 120.0f, 2.3f, 1);
        Eletronico eletronic2 = new Eletronico("preto");
        Eletronico eletronic3 = new Eletronico("branco", 3);
        Eletronico eletronic4 = new Eletronico("roxo", 1330f, 3.4f);
        Eletronico eletronic5 = new Eletronico("azul escuro", 2223f);

        // Exibir as informações
       eletronic1.imprimirInformações();
       




    }
}
