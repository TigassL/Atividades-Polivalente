import java.util.Scanner;

public class Atividadeonze {
    public static void main(String[] args) {
        /*Faça um algoritmo para ler o Nome, número de horas trabalhadas e número de dependentes de
        um funcionário. Após a leitura e os devidos cálculos escreva qual o Nome, salário bruto, os valores
        descontados para cada tipo de imposto e finalmente qual o salário líquido do funcionário. */
        String nome;
        double horasTrabalhadas, dependentes, inss, impostoRenda, salarioBruto, salarioLiquido;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário");
        nome = entrada.nextLine();
        System.out.println("Quantas horas esse funcionário trabalhou?");
        horasTrabalhadas = entrada.nextDouble();
        System.out.println("digite o número de dependentes");
        dependentes = entrada.nextDouble();
        salarioBruto = (horasTrabalhadas*45.00)+(150.00*dependentes);
        inss = salarioBruto*0.11;
        impostoRenda = salarioBruto*0.07;
        salarioLiquido = salarioBruto-inss-impostoRenda;
        System.out.println("Salario Bruto:"+salarioBruto);
        System.out.println("Valor do inss:"+inss);
        System.out.println("Valor do imposto de renda:"+impostoRenda);

        System.out.println("O salário líquido desse funcionário é:" +salarioLiquido);



    }
}
