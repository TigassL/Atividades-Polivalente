import java.util.Scanner;
public class quatro {
    public static void main(String[] args) {
        double num;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        num = input.nextDouble();
        if(num%2 == 0){
            System.out.println("Número par");
        } else{
            System.out.println("número ímpar");
        }
    }
}
