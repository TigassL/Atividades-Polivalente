import java.util.Scanner;

public class Atividadevintedois {
    public static void main(String[] args) {
        int cod;
        double Sg,Se,St,So, aumento, diferenca;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o código do cargo, seguindo: 101, 102, 103, e outros");
        cod = input.nextInt();
        switch (cod) {
            case 101:
                System.out.println("Digite o salário do Gerente:");
                Sg = input.nextDouble();
                aumento = Sg+(Sg*0.10);      
                diferenca = aumento - Sg;
                System.out.println("O salário:"+Sg +"Aumentou para"+aumento +"Com uma diferença de:"+diferenca);    
                break;
            case 102:
                System.out.println("Digite o salário do engenheiro");
                Se = input.nextDouble();
                aumento = Se+(Se*0.20);
                diferenca = aumento - Se;
                System.out.println("O salário:"+Se +"Aumentou para"+aumento +"Com uma diferença de:"+diferenca);
                break;
            case 103:
                System.out.println("Digite o salário do técnico:");
                St = input.nextDouble();
                aumento = St+(St*0.30);
                diferenca = aumento - St;
                System.out.println("O salário:"+St +"Aumentou para"+aumento +"Com uma diferença de:"+diferenca);
                break;
            default:
                System.out.println("Digite o salário do funcionário:");
                So = input.nextDouble();
                aumento = So+(So*0.40);
                diferenca = aumento - So;
                System.out.println("O salário:"+So +"Aumentou para"+aumento +"Com uma diferença de:"+diferenca);
                break;
        }
    }
}
