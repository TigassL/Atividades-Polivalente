import java.util.Scanner;
public class Atividadesete{
        /* Faça um algoritmo que transforme uma velocidade fornecida em m/s pelo usuário
        para Km/h. Para tal, multiplique o valor em m/s por 3,6.
        */
    public static void main(String[] args){

        double ms, kmh;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma velocidade em m/s²");
        ms = entrada.nextDouble();

        kmh = ms*3.6;
        System.out.println("Essa velocidade em km/h é:" +kmh);
    }


}