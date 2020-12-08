public class RegistroRecebimentos implements Recebivel  {
    static Recebivel[] registros;
    public static void main(String[] args){
        Servico servico = new Servico("Teste", 10, 11.5);
        registros[0] = servico;
        ItemVenda venda = new ItemVenda("Teste", 5, 5);
        registros[1] = venda;
        System.out.println();
    }

    @Override
    public double totalizarReceita() {
        double valorTotal = 0;
        for(Recebivel registro : registros){
            valorTotal = valorTotal + registro.totalizarReceita();
        }
        return valorTotal;
    }
}
