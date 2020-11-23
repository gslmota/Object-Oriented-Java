package semana11;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ConversorTemperatura {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            double tempFahrenheit = 0;
            System.out.println("Digite a temperatura Fahrenheit que deseja converter: ");
            tempFahrenheit = input.nextDouble();
            if(tempFahrenheit < -459.67){
                throw new FahrenheitException(01);
            }
            double tempCelsius = 0;
            tempCelsius = converteFahrenheitParaCelsius(tempFahrenheit);
            System.out.println("A temperatura  " + tempFahrenheit + "em Celsius é: " + tempCelsius);
        } catch(InputMismatchException e){
            System.err.println(e);
            System.out.println("ERRO! Entre com um valor inteiro!");
        } catch(FahrenheitException e){
            System.err.println(e);
            System.out.println("ERRO! Valor menor que -459,67");
        }
    }

    public  static double converteFahrenheitParaCelsius(double fahrenheit){
        double temperatura = 0;
        temperatura = (5*(fahrenheit - 32))/9;
        return temperatura;
    }
}
