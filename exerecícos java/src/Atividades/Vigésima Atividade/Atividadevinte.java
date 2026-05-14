import java.util.Scanner;

public class Atividadevinte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] opcao = new int[4];
        int [][] tabela ={
        {180, 230, 250, 350},
        {75, 110, 170, 200},
        {20, 70, 100, 65}
        };
        int prato, sobremessa, bebida, calorias;
        
        System.out.println("Escolha um prato de 1 a 4");
        System.out.println("1 - Vegetariano");
        System.out.println("2 - Peixe");
        System.out.println("3 - Frango");
        System.out.println("4 - Carne");
        prato = input.nextInt();
        while(prato<1 && prato>4) {
            System.out.println("opção válida");
        }
        System.out.println("Escolha uma sobremessa de 1 a 4");
         System.out.println("1 - Abacaxi");
        System.out.println("2 - Sorvete Diet");
        System.out.println("3 - Mousse Diet");
        System.out.println("4 - Mousse Chocolate");
        sobremessa = input.nextInt();
        while(sobremessa<1 && sobremessa>4) {
            System.out.println("opção válida");
        }
        System.out.println("Escolha uma bebida de 1 a 4");
        System.out.println("1 - Chá");
        System.out.println("2 - Suco laranja");
        System.out.println("3 - Suco melão");
        System.out.println("4 - Refri Diet");
        bebida = input.nextInt();
        while(bebida<1 && bebida>4) {
            System.out.println("opção inválida");
        }   
        
        calorias = tabela[prato-1][0] + tabela[sobremessa-1][1] + tabela[bebida-1][2];

        System.out.println("O total das calorias da sua refeição foi:" +calorias);
    }
}
