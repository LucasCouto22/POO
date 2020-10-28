public class ConversaoDeUnidadesDeArea{
    public static double meter_sqt_to_feet_sqt(double meter_sqt){
        return meter_sqt * 10.76;
    }

    public static double feet_sqt_to_centi_sqt(double feet_sqt){
        return feet_sqt * 929;
    }

    public static double miles_sqt_to_acres(double miles_sqt){
        return miles_sqt * 640;
    }

    public static double acres_to_feet_sqt(double acres){
        return acres * 43560;
    }

    public static double meter_sqt_to_acres(double meter_sqt){
        return (meter_sqt_to_feet_sqt(meter_sqt)/ 43560);
    }

    public static double meter_sqt_to_centi_sqt(double meter_sqt){
        return (feet_sqt_to_centi_sqt(meter_sqt_to_feet_sqt(meter_sqt)));
    }
}
