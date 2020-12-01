import java.time.LocalDate;
public class Carro {
    String montadora;
    String modelo;
    LocalDate diaAluguel;
    LocalDate devolução;
    String nomeAluguel;
    float multa = 500;
    boolean existeAmassado = false;
    float valorPago;
}


public class Locadora{
    private Carro carro = new Carro();




    void alugarCarro(Carro aux){
        carro.montadora = aux.montadora;
        carro.modelo = aux.modelo;
        LocalDate data = LocalDate.now();
        carro.diaAluguel = data;
        carro.nomeAluguel = aux.nomeAluguel;
        carro.valorPago = aux.valorPago;
    }

    
    float devolverCarro(Carro aux){
        LocalDate data = LocalDate.now();
        carro.devolução = data;
        if(aux.existeAmassado){
            return carro.multa;
        }
        else return 0;
    }

}