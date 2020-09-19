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
    public Eletronico(String cor, float preco,float peso, int tempoDeUso){
        this.cor = cor;
        this.peso = peso;
        this.preco = preco;
        this.tempoDeUso = tempoDeUso;
    }
    
}
