// Gabriel Sávio de lima Mota   6319
package semana3;
public class PrincipalEletronico {
    public static void main(String[] args) {
        // Validando os Construtores da Classe Eletrônico
        Eletronico eletronic1 = new Eletronico("verde", 120.0, 2.3, 1);
        Eletronico eletronic2 = new Eletronico("preto");
        Eletronico eletronic3 = new Eletronico("branco", 3);
        Eletronico eletronic4 = new Eletronico("roxo", 1330, 3.4);
        Eletronico eletronic5 = new Eletronico("azul escuro", 222.34);

        // Exibir as informações
       System.out.println("Objeto 1");
       eletronic1.imprimirInformações();

       System.out.println("Objeto 2");
       eletronic2.imprimirInformações();

       System.out.println("Objeto 3");
       eletronic3.imprimirInformações();

       System.out.println("Objeto 4");
       eletronic4.imprimirInformações();

       System.out.println("Objeto 5");
       eletronic5.imprimirInformações();
    }
}
