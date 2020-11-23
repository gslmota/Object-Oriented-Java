package semana11;

public class TemperatureException extends Exception {
    private int numeroErro;

    public TemperatureException() {
        
    }

    public TemperatureException(int numeroErro) {
        this.numeroErro = numeroErro;
    }

    public String toString() {
        return "TemperatureException [numeroErro=" + numeroErro + "]";
    }

}
