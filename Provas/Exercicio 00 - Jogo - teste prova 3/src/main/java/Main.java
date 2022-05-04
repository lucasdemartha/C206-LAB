import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arquivo a = new Arquivo();
        Jogo j = new Jogo();
        boolean flag = true;

        while(flag) {
            System.out.println("1 - Cadastrar jogo");
            System.out.println("2 - Mostrar informações salvas");
            System.out.println("3 - Ordenar em ordem crescente de preço");
            System.out.println("4 - Ordenar em ordem decrescente de preço");
            System.out.println("5 - Sair");
            System.out.println("Sua opção: ");
            int op = sc.nextInt();

            switch (op){
                case 1:
                    sc.nextLine();
                    System.out.println("Digite o nome do jogo: ");
                    j.setNome(sc.nextLine());
                    System.out.println("Digite o gênero do jogo: ");
                    j.setGenero(sc.nextLine());
                    System.out.println("Digite o preço: ");
                    j.setPreco(sc.nextDouble());
                    try{
                        if(j.getPreco() <= 0){
                            throw new PrecoNegativoException();
                        }
                    }catch(PrecoNegativoException e){
                        break;
                    }
                    a.escrever(j);
                    System.out.println("Jogo cadastrado com sucesso!");
                    break;

                case 2:
                    ArrayList<Jogo> jog = a.ler();
                    for(int i = 0; i < jog.size(); i++){
                        System.out.println("***Jogo***");
                        System.out.println("Nome: " + jog.get(i).getNome());
                        System.out.println("Preço: " + jog.get(i).getPreco());
                        System.out.println("Gênero: " + jog.get(i).getGenero());
                    }
                    break;
                case 3:
                    List<Jogo> jogos = a.ler();
                    Collections.sort(jogos);
                    for(int i=0; i < jogos.size(); i++){
                        System.out.println("Nome: " + jogos.get(i).getNome());
                        System.out.println("Gênero: " + jogos.get(i).getGenero());
                        System.out.println("Preço: " + jogos.get(i).getPreco());
                    }
                    break;

                case 4:
                    List<Jogo> jogos2 = a.ler();
                    Collections.sort(jogos2);
                    Collections.reverse(jogos2);
                    for(int i=0; i< jogos2.size(); i++){
                        System.out.println("Nome: " + jogos2.get(i).getNome());
                        System.out.println("Gênero: " + jogos2.get(i).getGenero());
                        System.out.println("Preço: " + jogos2.get(i).getPreco());
                    }
                    break;

                case 5:
                    System.out.println("Você saiu");
                    flag = false;
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }



        }


    }
}
