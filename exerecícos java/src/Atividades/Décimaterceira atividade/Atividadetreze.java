import java.util.Scanner;

public class Atividadetreze {
    public static void main(String[] args){

        double num;
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um número:");
        num = entrada.nextDouble();

        if(num%2 == 0){

            System.out.println("O número" +num +" é par!!");
        }else{

            System.out.println("O número" +num +"é ímpar");
        }

    }
}
