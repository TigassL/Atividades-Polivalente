import java.util.Scanner;

public class Atividadequinze {
    public static void main(String[] args){

        double fahrenheit, celsius;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma temperatura em fahrenheit:");
        fahrenheit = entrada.nextDouble();
        celsius = (fahrenheit-32)*(5.0/9.0);
        System.out.println("Essa temperatura em celsius é:" +celsius);


    }

}
