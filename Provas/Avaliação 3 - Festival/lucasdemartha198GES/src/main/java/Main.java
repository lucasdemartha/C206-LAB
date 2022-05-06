import java.util.*;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Arquivo a = new Arquivo();
        Artista artista = new Artista();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++){
            System.out.println("Digite o nome: ");
            artista.setNome(sc.nextLine());
            System.out.println("Digite qnt ouvintes: ");
            artista.setOuvintesMensais(sc.nextInt());
            sc.nextLine();
            System.out.println("Digite a musica mais famosa: ");
            artista.setMusicaMaisFamosa(sc.nextLine());
            System.out.println("Artista internacional?: ");
            artista.setInternacional(sc.nextBoolean());
            sc.nextLine();
            try{
                if(artista.getOuvintesMensais() < 10000){
                    throw new OuvitesMensaisException();
                }
            }catch(OuvitesMensaisException e){
                artista.semFamaSuficiente();
            }
            a.escrever(artista);
        }

        System.out.println("Artistas Internacionais Ordem Crescente");

        List<Artista> art = a.ler();
        Collections.sort(art);
        for(int i=0; i < art.size(); i++) {
            if (art.get(i) != null) {
                System.out.println("------------------------");
                if (art.get(i).isInternacional()) {
                    System.out.println("Nome: " + art.get(i).getNome());
                    System.out.println("Ouvintes: " + art.get(i).getOuvintesMensais());
                    System.out.println("Musica mais Famosa: " + art.get(i).getMusicaMaisFamosa());
                    System.out.println("Artista internacional: " + art.get(i).isInternacional());
                }
                System.out.println("------------------------");
            }
        }

        System.out.println("Artistas Nacionais Ordem Decrescente");

        Collections.reverse(art);
        for(int i=0; i < art.size(); i++) {
            if (art.get(i) != null) {
                System.out.println("------------------------");
                if (art.get(i).isInternacional()) {
                    i++;
                } else {
                    System.out.println("Nome: " + art.get(i).getNome());
                    System.out.println("Ouvintes: " + art.get(i).getOuvintesMensais());
                    System.out.println("Musica mais Famosa: " + art.get(i).getMusicaMaisFamosa());
                    System.out.println("Artista internacional: " + art.get(i).isInternacional());
                }
                System.out.println("------------------------");
            }
        }
    }
}
