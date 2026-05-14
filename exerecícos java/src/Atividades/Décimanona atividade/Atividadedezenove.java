import java.util.Scanner;

public class Atividadedezenove {
    public static void main(String[] args) {
        int ma, nota1, nota2, nota3, mee;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite as três notas das provas do aluno:");
        nota1 = input.nextInt();
        nota2 = input.nextInt();
        nota3 = input.nextInt();
        System.out.println("Digite a média de exercícios feitos pelo aluno");
        mee = input.nextInt();
        ma = (nota1+(nota2*2)*(nota3*3)+mee)/7;
        System.out.println("A média de aproveitamento desse aluno foi:" +ma);
        
         if (ma >= 9) {
            System.out.println("Conceito: A, aluno aprovado");
        }
        if (ma >=7.5 && ma<9) {
            System.out.println("Conceito: B, aluno aprovado");
        }
        if (ma>=6 && ma<7.5) {
            System.out.println("Conceito: C, aluno aprovado");
        }
        if (ma >=4 && ma<6) {
            System.out.println("Conceito: D, aluno reprovado");
        }
        if (ma<4) {
            System.out.println("Conceito: E, aluno reprovado");
        }
    }
    
}
