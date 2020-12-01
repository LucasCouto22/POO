public class Produto {
    int codigoProduto;
    double preço;
    int estoque;




    int vendeProduto(Produto estoque, int quantidade){
        if(estoque.estoque - quantidade >= 0){
        estoque.estoque = estoque.estoque - quantidade;
        return 1;
        }else{
            return 0;
        }
    }
}
