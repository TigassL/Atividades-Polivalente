import java.util.Scanner;

public class Atividadeoito {
    /* Faça um algoritmo que calcule e apresente o valor do volume de uma lata de óleo, dado seu raio
    e sua altura. */
    public static void main(String[] args){

        double raio, altura, volume;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio e a altura da lata de óleo:");
        raio = entrada.nextDouble();
        altura = entrada.nextDouble();

        volume = 3.14*Math.pow(raio, 2)*altura;
        System.out.println("O volume dessa lata de óleo é:" +volume);

    }

    
    
}