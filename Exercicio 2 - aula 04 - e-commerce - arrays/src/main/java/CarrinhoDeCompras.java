public class CarrinhoDeCompras {
    Produto[] produtos;
    String donoDoCarrin;
    int i = 0;

    CarrinhoDeCompras(String donoDoCarrin){
        this.donoDoCarrin = donoDoCarrin;
    }

    void mostraCarrin(){
        System.out.println("O carrinho de " + donoDoCarrin + " possui tais produtos: ");
        while (i < produtos.length){
            if(produtos[i] != null){
                produtos[i].mostraInfo();
                i++;
            }
            else
                i++;
        }
    }


}