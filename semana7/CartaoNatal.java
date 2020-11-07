package semana7;

public class CartaoNatal extends CartaoWeb {

    public CartaoNatal(String destinatario) {
        super(destinatario);
    }

    public String retornarMensagem(String remetente) {
        return "Feliz Natal" + this.destinatario + "Espero que tenha um excelente natal! Um Abraço!" + "De: "+ remetente;
    }
}