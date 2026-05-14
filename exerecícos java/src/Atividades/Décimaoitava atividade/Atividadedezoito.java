import java.util.Scanner;

public class Atividadedezoito{
    public static void main(String[] args) {
        
        int idade;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade do nadador:");
        idade = input.nextInt();
        if (idade >=5 && idade <=7){

            System.out.println("Infantil A");
        }
        if (idade >=8 && idade <=10){

            System.out.println("Infantil B");
        }
        if (idade >=11 && idade <=13){

            System.out.println("Juvenil A");
        }
        if (idade >=14 && idade <=17 ){

            System.out.println("Juvenil B");
        }
        if (idade >=18){

            System.out.println("Adulto");
        }



    }

}