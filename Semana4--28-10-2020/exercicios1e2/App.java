public class App {
    public static void main(String[] args) {
        int campoFutebol = 8250; //Metros quadrados 
        System.out.println("Um campo de futebol em pés quadrados: " + ConversaoDeUnidadesDeArea.meter_sqt_to_feet_sqt(campoFutebol));
        System.out.println("Um campo de futebol em acres: " + ConversaoDeUnidadesDeArea.meter_sqt_to_acres(campoFutebol));
        System.out.println("Um campo de futebol em centimetros quadrados: " + ConversaoDeUnidadesDeArea.meter_sqt_to_centi_sqt(campoFutebol));
        

    }
}