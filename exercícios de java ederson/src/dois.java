import java.util.Scanner;
public class dois {
    public static void main(String[] args) {
        int idade;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma idade");
        idade = input.nextInt();
        if(idade >= 18){
            System.out.println("Maior de idade");
        } else{
            System.out.println("Menor de idade");
        }
    }
}
