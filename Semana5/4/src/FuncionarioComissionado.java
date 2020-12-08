public class FuncionarioComissionado extends Funcionario {
    private float valorVendas = 5000;

    public double pagarFuncionario(){
        return (0.1 * this.valorVendas) * 1.1;
    }
}
