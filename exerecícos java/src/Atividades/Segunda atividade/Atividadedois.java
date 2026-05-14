import java.util.Scanner;

public class Atividadedois {

    public static void main(String[] args) {
        /* Faça um algoritmo que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar
        que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. */
        Double n1, n2, n3, media;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno:");
        n1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota do aluno:");
        n2 = entrada.nextDouble();
        System.out.println("Digite a terceira nota do aluno:");
        n3 = entrada.nextDouble();

        media = (n1*2+n2*3+n3*5)/(2+3+5);
        System.out.println("A media ponderada do aluno é:" +media);
    }
    
}
