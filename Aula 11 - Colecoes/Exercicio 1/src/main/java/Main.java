import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int menor = 110;
        int maior = 0;

        ArrayList<Produto> carrinho = new ArrayList<>();

        Produto p1 = new Produto("Abacate",5);
        Produto p2 = new Produto("Abacaxi",10);
        Produto p3 = new Produto("Banana",3);
        Produto p4 = new Produto("Pera",6);
        Produto p5 = new Produto("uva",7);

        carrinho.add(p1);
        carrinho.add(p2);
        carrinho.add(p3);
        carrinho.add(p4);
        carrinho.add(p5);

        Collections.sort(carrinho);
        System.out.println("Menor preco: " + p3.nome);
        System.out.println("Maior preco: " + p2.nome);

        //ORDEM DE PRECO
//        System.out.println("-------------------------");
//        for(Produto produto: carrinho)
//        {
//            System.out.println("Produto: " + produto.nome);
//            System.out.println("Preco: " + produto.preco);
//            System.out.println("-------------------------");
//        }


        //ORDEM ALFABETICA
//        System.out.println("-------------------------");
//        for(Produto produto: carrinho)
//        {
//            System.out.println("Produto: " + produto.nome);
//            System.out.println("Preco: " + produto.preco);
//            System.out.println("-------------------------");
//        }


        //ORDEM DECRESCENTE
        Collections.reverse(carrinho);
        System.out.println("-------------------------");
        for(Produto produto: carrinho)
        {
            System.out.println("Produto: " + produto.nome);
            System.out.println("Preco: " + produto.preco);
            System.out.println("-------------------------");
        }



    }
}
