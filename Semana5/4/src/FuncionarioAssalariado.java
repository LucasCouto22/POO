public class FuncionarioAssalariado extends Funcionario{
    
    private float SalarioBase = 900;
    
    public double pagarFuncionario(){
        
        return (this.salarioBase * 1.1) * 1.1;
        
    }

}
