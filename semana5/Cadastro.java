package semana5;

public class Cadastro {
    String email, nome;
    public Cadastro(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public void vefificaEmail(String email){
        String tex = email;
        String a, b;
        a = "@";
        b = ".";
        if(tex.toUpperCase().length() > 2){
            if(tex.indexOf(a) > 0){
                if(tex.indexOf(b) > 0){
                    System.out.println("Email e Nome Válidos");
                }
                else {
                System.out.println("Email e Nome Inválidos");
                }
            } else {
                System.out.println("Email e Nome Inválidos");
            }
        
        } else{
            System.out.println("Email e Nome Inválidos");
        }
    }
}// Fim