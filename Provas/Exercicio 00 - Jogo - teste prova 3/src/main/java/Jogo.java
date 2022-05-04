public class Jogo implements Comparable<Jogo>{

    private String nome;
    private double preco;
    private String genero;

    public Jogo() {
        this.nome = nome;
        this.preco = preco;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int compareTo(Jogo j) {
        return Double.compare(this.preco,j.preco);
    }
}
