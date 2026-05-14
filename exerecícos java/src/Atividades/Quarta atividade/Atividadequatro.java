import java.util.Scanner;

public class Atividadequatro {
    /*Solicitar salario, prestação. Se prestação for maior que 20% do salario, imprimir Empréstimo não
    pode ser concedido. Senão imprimir Empréstimo pode ser concedido.
    */
    public static void main (String[] args){

        double salario, prestacao;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu salário:");
        salario = entrada.nextDouble();
        System.out.println("Digite sua prestação:");
        prestacao = entrada.nextDouble();

        if (prestacao > salario*0.2) {
            System.out.println("Empréstimo não pode ser concedido");
        
        }else{

            System.out.println("Emprestimo pode ser concedido");
        }


    }
}
