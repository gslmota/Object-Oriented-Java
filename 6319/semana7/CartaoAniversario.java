package semana7;

public class CartaoAniversario extends CartaoWeb {

    public CartaoAniversario(String destinatario) {
        super(destinatario);
    }

    public String retornarMensagem(String remetente) {
       return "Olá" + this.destinatario + "Feliz dia aniversário! Muitos anos de vida, muitas felicidades, você merece tudo de bom que existe nesse mundo!" + "De: "+ remetente;
    }
}
