public class Pedido {
    Item[] pedido = new Item[100];
    String formaPagamento;

    public void set_pedido(Item item){
        this.pedido.add(item);
    }
    public Item[] get_pedido(){
        return this.pedido;
    }
    public void set_formaPagamento(String formaPagamento){
        this.formaPagamento = formaPagamento;
    }
    public String get_formaPagamento(){
        return this.formaPagamento;
    }
}
