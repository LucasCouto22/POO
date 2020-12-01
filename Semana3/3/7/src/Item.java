public class Item {
    Produto item;
    int quantidade;

    public void set_item(Produto item){
        this.item = item;
    }
    public void set_quantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public Produto get_item(){
        return this.item;
    }
    public int get_quantidade(){
        return this.quantidade;
    }
}

