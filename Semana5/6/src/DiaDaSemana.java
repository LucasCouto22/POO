public class DiaDaSemana {
    private DiaDaSemanaEnum dia;


    public void set_dia(DiaDaSemanaEnum dia){
        this.dia = dia;
    }
    public DiaDaSemanaEnum get_dia(){
        return this.dia;
    }

    public boolean ehDiaUtil(){
        if(get_dia() == DiaDaSemanaEnum.SEGUNDA ||
        get_dia() == DiaDaSemanaEnum.TERÇA ||
        get_dia() == DiaDaSemanaEnum.QUARTA ||
        get_dia() == DiaDaSemanaEnum.QUINTA ||
        get_dia() == DiaDaSemanaEnum.SEXTA){
            return true;
        }else{
            return false;
        }
    }
}
