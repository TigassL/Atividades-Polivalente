import java.util.Scanner;

public class Atividadedezesseis {
    public static void main(String[] args) {
        double dkm, kmpL, precoc, qtL, ct;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a distância da viagem em kilômetros");
        dkm = entrada.nextDouble();
        System.out.println("Digite o consumo do seu veículo em km/l:");
        kmpL = entrada.nextDouble();
        System.out.println("Digite o preço do combustível:");
        precoc = entrada.nextDouble();
        qtL = dkm/kmpL;
        ct = precoc * qtL;
        System.out.println("A quantidade de litros necessária para essa viajem é:" +qtL);
        System.out.println("O custo dessa viajem é:" +ct);

    }
    
}
