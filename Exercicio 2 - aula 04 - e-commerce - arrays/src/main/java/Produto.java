import java.util.Scanner;

public class Produto {
    Scanner input = new Scanner(System.in);

    String nome, descri, fabricante;
    double cust;

    void inserirProduto(){
        System.out.println("Qual o nome do produto?");
        nome = input.nextLine();
        System.out.println("Qual a descrição do produto?");
        descri = input.nextLine();
        System.out.println("Qual o fabricante do produto?");
        fabricante = input.nextLine();
        System.out.println("Qual o preço do produto?");
        cust = input.nextDouble();
        input.nextLine();
    }

    void mostraInfo(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Descrição do produto: " + descri);
        System.out.println("Fabricante do produto: " + fabricante);
        System.out.println("Preço do produto: " + cust);
        System.out.println("-----------------------------");
    }
}