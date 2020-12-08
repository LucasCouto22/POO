public class FuncionarioAssalariado extends Funcionario{
    private float SalarioBase = 900;
    public double pagarFuncionario(){
        return (this.SalarioBase * 1.1) * 1.1;
    }

}