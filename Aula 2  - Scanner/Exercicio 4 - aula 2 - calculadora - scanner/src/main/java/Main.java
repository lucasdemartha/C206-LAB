import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float A, B;
        String op;
        char simbolo;

        System.out.println("Digite os numeros: ");
        A = input.nextFloat();
        B = input.nextFloat();
        System.out.println("Digite a operação desejada: ");
        input.nextLine(); //quebra linhas para entrar com a string
        op = input.nextLine();
        simbolo = op.charAt(0); //iremos pegar a posição 0 da string


        switch (simbolo) {
            case '+':
                System.out.println("A soma deu: " + (A + B));
                break;
            case'-':
                System.out.println("A diferença deu: " + (A - B));
                break;
            case '*':
                System.out.println("A multiplicação deu: " + (A * B));
                break;
            case '/':
                System.out.println("A divisão deu: " + (A / B));
                break;
            default:
                System.out.println("Operação desconhecida.");
         }
    }
}
