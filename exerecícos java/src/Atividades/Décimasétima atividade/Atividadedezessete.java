import java.util.Scanner;

public class Atividadedezessete {
    public static void main(String[] args) {
        double termoum, r, posicaod, termopd;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro termo de uma PA:");
        termoum = input.nextDouble();
        System.out.println("Digite a razão de uma PA:");
        r = input.nextDouble();
        System.out.println("Digite a posição desejada de uma PA:");
        posicaod = input.nextDouble();
        termopd = termoum + (posicaod-1)*r;
        System.out.println("O termo nessa posição é:" +termopd);

        double primeirotermo, q, posicao, termoachado;
        System.out.println("Digite o primeiro termo de uma PG:");
        primeirotermo = input.nextDouble();
        System.out.println("Digite a razão de uma PG:");
        q = input.nextDouble();
        System.out.println("Digite a posição desejada de uma PG:");
        posicao = input.nextDouble();
        termoachado = primeirotermo * (Math.pow(q, primeirotermo-1));
        System.out.println("O termo dessa posição é:" +termoachado);
    }
}
