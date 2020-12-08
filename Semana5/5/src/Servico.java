public class Servico implements Recebivel{
    String descricao;
    int horas;
    double precoHora;

    public Servico(String descricao, int horas, double precoHora){
        this.descricao = descricao;
        this.horas = horas;
        this.precoHora = precoHora;
    }

    public double totalizarReceita(){
        return this.horas * this.precoHora;
    }
}
