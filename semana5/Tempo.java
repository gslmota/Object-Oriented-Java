package semana5;
public class Tempo {
    // Atributos
    private int hora, minuto, segundo;
    
    // Construtor
    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }


    // Get e Set
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora >= 0 && hora <=24){
            this.hora = hora;
        } else{
            System.out.println("Digite uma hora válida!");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if(minuto >= 0 && minuto <= 59){
            this.minuto = minuto;
        } else{
            System.out.println("Digite um minuto válido!");
        }
        
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if(segundo >= 0 && segundo <= 59){
            this.segundo = segundo;
        } else{
            System.out.println("Digite um segundo válido!");
        }
    }
}
