package semana11.prova;

public abstract class ve {
    private String marca;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ve(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }
}
