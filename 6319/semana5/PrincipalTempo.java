package semana5;

public class PrincipalTempo {
    public static void main(String[] args) {
        Tempo t1 = new Tempo(8, 23, 12);
        Tempo t2 = new Tempo(3,00);
        Tempo t3 = new Tempo(22);
        Tempo t4 = new Tempo();
        Tempo t5 = new Tempo(t1);

        t1.toString();
        t2.toString();
        t3.toString();
        t4.toString();
        t5.toString();
    }
}
