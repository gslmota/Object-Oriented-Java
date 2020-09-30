package semana5;

public class Carro {
    // Atributos
    private String marca, modelo;
    private int ano,totalKm;
    
    // Construtor
     
	public Carro(String marca, String modelo, int ano, int totalKm) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.totalKm = totalKm;
	}

    // get e set
    
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getTotalKm() {
		return totalKm;
	}
	public void setTotalKm(int totalKm) {
		this.totalKm = totalKm;
    }
}

