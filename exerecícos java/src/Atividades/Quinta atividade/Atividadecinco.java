import java.util.Scanner;

public class Atividadecinco {
    /* Receber um numero e imprimir: maior que 20, igual a 20 ou menor que 20. */
    public static void main(String[] args){

        Double num;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        num = entrada.nextDouble();
        if (num > 20) {
            System.out.println("Número maior que 20");
        }
        if (num == 20){
            System.out.println("Número é 20");
        }
        if (num < 20){
            System.out.println("Número menor que 20");
        }
    }
    
}
