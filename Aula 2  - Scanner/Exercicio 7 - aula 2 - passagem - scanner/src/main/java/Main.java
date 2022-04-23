import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float dinheiro;
        float passagem = 2.75f;
        int total;

        System.out.println("Digite o valor em R$: ");
        dinheiro = input.nextFloat();

        total = (Math.round(dinheiro/passagem));

        System.out.println("Será possível realizar " + total + " viagens de ônibus.");
    }
}
