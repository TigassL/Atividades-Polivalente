import java.util.Scanner;

public class Atividadenove {
    /* Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro da mesma. */
    public static void main(String[] args){

        double raio, area, perimetro;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio da circunfêrencia");
        raio = entrada.nextDouble();
        area = 3.14*Math.pow(raio, 2);
        perimetro = 2*3.14*raio;

        System.out.println("A área dessa circunferência é:" +area);
        System.out.println("O perímetro dessa circunferência é:" +perimetro);
    }
    
}
