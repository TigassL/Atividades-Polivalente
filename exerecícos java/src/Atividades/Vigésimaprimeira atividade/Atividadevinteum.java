import java.util.Scanner;

public class Atividadevinteum {
    public static void main(String[] args) {
        int a, b, c, t, area, p;
        double d;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 3 números inteiros positivos");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if(a+b>c){

            System.out.println("Esses números formam um triângulo");
            p = (a+b+c)/2;
            area = (int) Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("A área desse triângulo é:"+area);

        }else{
            System.out.println("Os números:" +a +b +c +"Não representam um triângulo");


    }
}
}
