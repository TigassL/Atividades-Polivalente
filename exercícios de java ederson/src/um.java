import java.util.Scanner;
public class um {
    public static void main(String[] args) {
        int a, b, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite dois números inteiros:");
        a = input.nextInt();
        b = input.nextInt();
        result = a+b;
        System.out.println("A soma desses números é:" +result);
        result = a-b;
        System.out.println("A subtração desses números é:" +result);
        result = a*b;
        System.out.println("A multiplicação desses números é:" +result);
    }
}
