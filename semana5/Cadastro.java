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
    if(email.indexOf(a){

        return true;
    } else {
        return false;
    }

}