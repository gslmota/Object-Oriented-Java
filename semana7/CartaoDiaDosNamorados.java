package semana7;

public class CartaoDiaDosNamorados extends CartaoWeb {

    public CartaoDiaDosNamorados(String destinatario) {
        super(destinatario);
    }

   
    public String retornarMensagem(String remetente) {
        return "Querida" + this.destinatario + "Feliz dia dos namorados! Espero que tenha sido o único cartão do dia dos namorados tenhaganhado nessa data!" + "De: "+ remetente;
    }
}
