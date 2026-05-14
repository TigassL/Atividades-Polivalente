import java.util.Scanner;

public class Atividadedoze {
    public static void main(String[]args){
        /*Escreva um programa que calcula o desconto previdenciário de um funcionário. Dado um salário,
        o programa deve retornar o valor do desconto proporcional ao mesmo. O cálculo segue a regra: o
        desconto é de 11% do valor do salário, entretanto, o valor máximo de desconto é 334,29, o que seja
        menor */

        double salario, descontop;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário:");
        salario = entrada.nextDouble();
        descontop = salario*0.11;

        if(descontop < 334.29){

            System.out.println("O desconto previdenciário deste funcionário é:R$" +descontop);
        }else {
            System.out.println("O desconto previdenciário deste funcionário é: R$334,29");
        }
    }
}
