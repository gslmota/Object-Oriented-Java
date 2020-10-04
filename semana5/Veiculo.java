package semana5;
public class Veiculo {
    // Atributos
    private String marca, modelo;
    private int ano,totalKm;
    
    // Construtor
     
	public Veiculo(String marca, String modelo, int ano, int totalKm) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.totalKm = totalKm;
	}
	public Veiculo(String modelo){
		this.modelo = modelo;
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

    // Métodos Sobrecarregados
    public void acelerar(String Modelo){
		System.out.println(" Acelerando " + Modelo + " !");
	}
	
	public void acelerar(){
		System.out.println("Acelerando o Carro " + getModelo());
	}

	public void acelerar(String Marca, String Modelo){
		System.out.println("Acelerando o carro :" + Modelo + " da Marca: " + Marca);
	}
}

