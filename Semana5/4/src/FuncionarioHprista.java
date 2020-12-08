public class FuncionarioHprista extends Funcionario {
    private float SalarioBase = 11;
    private float horaTrabalhada = 50;
    
    public double pagarFuncionario(){
        if(horaTrabalhada > 40){
            return (this.SalarioBase * 40 + this.SalarioBase * 1.5 * (this.horaTrabalhada - 40)) * 1.1;
        }else{
            return (this.SalarioBase * this.horaTrabalhada) * 1.1;
        }
    }
    
}
