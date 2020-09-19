// Gabriel Sávio de Lima Mota   6319

/*Implemente uma classe Java para representar um eletrônico da sua casa. Defina 4
atributos e 5 construtores. Em seguida, crie objetos para validar os 5 construtores
que você criou.*/

package semana3;
public class Eletronico {
    // Atributos
    String cor;
    float preco, peso;
    int tempoDeUso;
    // Construtores
    public Eletronico(String cor, float preco, float peso, int tempoDeUso){
        this.cor = cor;
        this.peso = peso;
        this.preco = preco;
        this.tempoDeUso = tempoDeUso;
    }

    public Eletronico(String cor, float preco,float peso){
        this.cor = cor;
        this.peso = peso;
        this.preco = preco;
    }

    public Eletronico(String cor, int tempoDeUso){
        this.cor = cor;
        this.tempoDeUso = tempoDeUso;
    }

    public Eletronico(String cor, float preco){
        this.cor = cor;
        this.preco= preco;
    }

    public Eletronico(String cor){
        this.cor = cor;
    }

    // Métodos
    public void imprimirInformações(){
        System.out.println("A cor é: " + this.cor);
        System.out.println("O preço é: " + this.preco);
        System.out.println("O peso é: " + this.peso);
        System.out.println("O Tempo de Uso é: " + this.tempoDeUso);
    }

}
