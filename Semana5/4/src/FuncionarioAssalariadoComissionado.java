public class FuncionarioAssalariadoComissionado extends Funcionario{
    private float SalarioBase = 900;
    private float valorVendas = 5000;

    public double pagarFuncionario(){
        return (this.SalarioBase + 0.1 * this.valorVendas) * 1.1;
    }
    
}
