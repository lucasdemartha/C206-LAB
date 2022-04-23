import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean flag = true;

        Time atletico = new Time();
        atletico.nome = "Atletico";
        atletico.corCamisa = "Alvinegra";
        atletico.estadio.nome = "Arena MRV";
        atletico.estadio.capacidade = 50000;
        atletico.estadio.cidade = "Belo Horizonte";

        System.out.println("Menu: ");
        while (flag){
            System.out.println("** Digite a opção desejada: **");
            System.out.println("1- Adicionar um jogador");
            System.out.println("2- Mostrar informações do time, estádio e de todos seus jogadores");
            System.out.println("3- Calcular valor total da soma dos salários dos jogadores");
            System.out.println("4- Mostrar informações dos jogadores que vieram da base do time");
            System.out.println("5- Sair");
            int op = input.nextInt();

            switch (op){
                case 1:
                    input.nextLine();
                    Jogador jogador = new Jogador();
                    System.out.println("Nome do jogador: ");
                    jogador.nome = input.nextLine();
                    System.out.println("Salário: ");
                    jogador.salario = input.nextDouble();
                    System.out.println("Número da camisa: ");
                    jogador.numCamisa = input.nextInt();
                    input.nextLine();
                    System.out.println("Jogador revelado na base: (true or false)");
                    jogador.base = input.nextBoolean();
                    atletico.adicionaJogador(jogador);
                    System.out.println("Jogador Adicionado");
                    break;
                case 2:
                    atletico.mostraInfo();
                    break;
                case 3:
                    System.out.println("----------------------------------");
                    System.out.println("Salario total do time: R$" + atletico.calculaTotalSalario());
                    System.out.println("----------------------------------");
                    break;
                case 4:
                    System.out.println("----------------------------------");
                    atletico.mostraJogadoresBase();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }


        }


    }

}
