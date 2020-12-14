public class FuncionarioHprestada extends Funcionario {
    
    private float salarioBase = 11;
    private float horaTrabalhada = 50;
    
    public double pagarFuncionario(){
        
        if(horaTrabalhada > 40){
            
            return (this.salarioBase * 40 + this.salarioBase * 1.5 * (this.horaTrabalhada - 40)) * 1.1;
        }else{
            
            return (this.salarioBase * this.horaTrabalhada) * 1.1;
        
        }
        
    }
    
}
