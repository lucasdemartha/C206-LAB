import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;


        Deck d1 = new Deck();

        System.out.println("Dono do Deck: ");
        d1.dono = sc.nextLine();

        System.out.println("**Menu**");

        while (flag) {
            System.out.println("Digite uma opção: ");
            System.out.println("1 - Adicionar uma nova carta ao Deck");
            System.out.println("2 - Mostrar informações do Deck e suas cartas");
            System.out.println("3 - Mostrar o tipo em maior quantidade no deck");
            System.out.println("4 - Mostrar media aritmetica de poder de cada tipo");
            System.out.println("5 - Sair");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    sc.nextLine();
                    Carta carta = new Carta();
                    System.out.println("Nome da carta: ");
                    carta.nome = sc.nextLine();
                    System.out.println("Tipo da carta: ");
                    carta.tipo = sc.nextLine();
                    System.out.println("Poder da carta: ");
                    carta.poder = sc.nextFloat();
                    System.out.println("Arma da carta: ");
                    sc.nextLine();
                    carta.arma.tipo = sc.nextLine();
                    d1.addCarta(carta);
                    System.out.println("Carta adicionada!!!");
                    break;
                case 2:
                    d1.mostraInfo();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("opcao invalida");
            }


        }


    }
}
