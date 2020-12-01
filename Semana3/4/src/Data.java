
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Data {
    LocalDate date;
    public Data(int dia, int mes, int ano){
        this.date = LocalDate.of(ano, mes, dia);
    }
    public Data(String mes, int dia, int ano){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");       
        CharSequence data = mes + "/" + String.valueOf(dia) + "/" + String.valueOf(ano);
        this.date = LocalDate.parse(data, formatter);
    }
    public Data(int dia, int ano){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        CharSequence data = String.valueOf(dia) + "/" + String.valueOf(ano);
        this.date = LocalDate.parse(data, formatter);
    }
    
}
