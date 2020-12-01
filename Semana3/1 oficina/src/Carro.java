import java.time.LocalDate;
public class Carro{
    String montadora;
    String modelo;
    String tipoServiço;
    float preço;
    LocalDate diaEntrada;
    String nomeDono;
    String modoPagamento;
    String nomeFuncionarioResponsavel;




    void darEntrada(){
        LocalDate dia = LocalDate.now();
        this.diaEntrada = dia; 
    }



    void pagar(String modoPagamento, float valor){
        this.modoPagamento = modoPagamento;
        this.preço = valor;
    }
}
