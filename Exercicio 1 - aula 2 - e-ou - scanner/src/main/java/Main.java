import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String opcao;
        char letra;

        System.out.println("Digite a opção desejada: ");
        opcao = teclado.nextLine();

        if (opcao.equals("E")){
            System.out.println("Tabela verdade AND: ");
            System.out.println("0 0 = 0");
            System.out.println("0 1 = 0");
            System.out.println("1 0 = 0");
            System.out.println("1 1 = 1");
        }

        else if (opcao.equals("OU")){
            System.out.println("Tabela verdade OR: ");
            System.out.println("0 0 = 0");
            System.out.println("0 1 = 1");
            System.out.println("1 0 = 1");
            System.out.println("1 1 = 1");
        }

        else {
            System.out.println("Opção Inválida");
        }
    }
}
