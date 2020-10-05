package semana5;

public class Cadastro {
    String email, nome;
public Cadastro(String nome, String email){
    this.nome = nome;
    this.email = email;
}

public boolean vefificaEmail(String email){
    String a, b;
    a = "@";
    b = ".";
    if(email.lenght)
    if(email.indexOf(a){
        if(email.indexOf(b)){
            return true;
        }
        else {
            return false;
        }
    } else {
        return false;
    }

}