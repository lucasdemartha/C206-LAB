import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float NP1, NP2;
        int MF;

        System.out.println("Entre com a NP1: ");
        NP1 = input.nextFloat();
        System.out.println("Entre com a NP2: ");
        NP2 = input.nextFloat();

        MF = (Math.round(NP1+NP2) / 2);

        System.out.println("Media final: ");
        System.out.println(MF);

    }

}
