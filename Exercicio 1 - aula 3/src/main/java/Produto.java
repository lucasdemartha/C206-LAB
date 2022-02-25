public class Produto {

    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    void mostraInfo(){
        System.out.println(
                "Codigo de Serie: " + codigoSerie +
                        " Codigo do Produto: " + codigoProduto +
                        " Nome do produto: " + nome +
                        " Categoria: " + categoria +
                        " Quantidade em estoque: " + quantidade
        );
    }

}
