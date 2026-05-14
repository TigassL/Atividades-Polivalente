import java.util.Scanner;

public class Atividadedez {
    /*Ler um número inteiro e exibir o seu sucessor. */
    public static void main(String[] args){
        int n, sucessor;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um número:");
        n = entrada.nextInt();
        sucessor = n+1;
        System.out.println("O sucessor desse número é:" +sucessor);

    }
}
