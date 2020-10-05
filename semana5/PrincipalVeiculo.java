package semana5;
public class PrincipalVeiculo {
    Veiculo moto = new Veiculo("moto", 32);
    moto.acelerar("honda", "moto");
    Veiculo carro = new Veiculo("carro");
    carro.acelerar();
    Veiculo lancha = new Veiculo("lancha");
    lancha.acelerar("lancha");
}
