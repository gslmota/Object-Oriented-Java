package semana2;
public class Matematica {
    int n1, n2;
    public int soma(int n1, int n2){
        int som = this.n1 + this.n2;
        return som;
    }

    public boolean verificaImpar(int n1){
        if(this.n1 % 2 == 0){
            return false;
        } else{
            return true;
        }
    }

    public int calculaQuadrado(int n1) {
        int quadrado = this.n1 * this.n1;
        return quadrado;
    }
}
