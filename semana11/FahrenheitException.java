package semana11;

public class FahrenheitException extends TemperatureException{
    private int numeroErro;

    public FahrenheitException() {

    }

    public FahrenheitException(int numeroErro) {
        this.numeroErro = numeroErro;
    }

	public String toString() {
		return "FahrenheitException [numeroErro=" + numeroErro + "]";
	}
    
}
