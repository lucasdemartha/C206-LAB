public class Produto implements Comparable<Produto> {

    public String nome;
    public int preco;

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto o) {
        return Integer.compare(this.preco, o.preco);
    }

//    @Override
//    public int compareTo(Produto o) {
//        return nome.compareTo(o.nome);
//    }

}
