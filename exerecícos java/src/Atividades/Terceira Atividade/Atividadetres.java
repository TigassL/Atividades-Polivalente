import java.util.Scanner;

public class Atividadetres {
    public static void main(String[] args){
        /*Receber um valor qualquer do teclado e imprimir esse valor com reajuste de 10%; */
        
        Double valor, reajuste;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite qualquer valor do teclado:");
        valor = entrada.nextDouble();
        reajuste = valor+(valor*0.10);
        
        System.out.println("O reajuste de 10% desse valor é:" +reajuste);


    }
}
