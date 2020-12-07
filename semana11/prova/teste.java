package semana11.prova;

public class teste {
    public static void main(String[] args) throws ArithmeticException {
        try {
            m1();
            System.out.println("C");
        } catch (Exception e) {
            System.out.println("D");
        }
        System.out.println("B");
}

public static void m1() throws ArithmeticException{
    throw new ArithmeticException ();
}
}