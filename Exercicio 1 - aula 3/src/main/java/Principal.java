public class Principal {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.codigoSerie = 00001;
        produto1.codigoProduto = "AAAA#";
        produto1.nome = "Abacaxi";
        produto1.categoria = "Frutas";
        produto1.quantidade = 32;

        Produto produto2 = new Produto();
        produto2.codigoSerie = 00032;
        produto2.codigoProduto = "AABB#";
        produto2.nome = "Trakinas";
        produto2.categoria = "Bolachas";
        produto2.quantidade = 87;

        produto1.mostraInfo();
        produto2.mostraInfo();
        
    }
}

