import java.util.Scanner;

public class Atividadeseis {
    /*Faça um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1,y1) e
    P(x2,y2), escreva a distância entre eles.
    */
    public static void main(String[] args){

        double x1, x2, y1, y2, distancia;
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Digite 2 pontos no plano cartesiano:");
        x1 = entrada.nextDouble();
        y1 = entrada.nextDouble();
        x2 = entrada.nextDouble();
        y2 = entrada.nextDouble();

        distancia = Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)));
        System.out.println("a distância entre esses pontos é:" +distancia);
    }
}
