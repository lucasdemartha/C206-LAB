import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Equipe e1 = new Equipe();
        boolean flag = true;

        System.out.println("Digite o nome do capitao da equipe: ");
        e1.capitao = input.nextLine();


        System.out.println("Menu Equipe dos heróis");

        while(flag) {
            System.out.println("Digite a sua opção: ");
            System.out.println("1 - adicionar novo herói");
            System.out.println("2 - mostrar as informações da equipe e seus heróis");
            System.out.println("3 - mostrar o heróis mais forte, de acordo com seu poder");
            System.out.println("4 - Calcular a porcentagem de heróis da equipe que podem voar");
            System.out.println("5 - sair");
            System.out.println("Insira sua opção: ");
            int op = input.nextInt();

            switch (op) {
                case 1:
                    input.nextLine();
                    Heroi heroi = new Heroi();
                    System.out.println("Nome do heroi: ");
                    heroi.nome = input.nextLine();
                    System.out.println("Poder do heroi: ");
                    heroi.poder = input.nextFloat();
                    input.nextLine();
                    System.out.println("Heroi voa? ");
                    heroi.podeVoar = input.nextBoolean();
                    e1.adicionarHeroi(heroi);
                    System.out.println("Heroi cadastrado com sucesso!!!! ");
                    break;
                case 2:
                    e1.mostraInfo();
                    break;
                case 3:
                    e1.mostraMaisForte();
                    break;
                case 4:
                    e1.calculaVoadores();
                    break;

                case 5:
                    flag = false;
                    break;

                default:
                    System.out.println("Opção invalida");
            }
        }
    }

}