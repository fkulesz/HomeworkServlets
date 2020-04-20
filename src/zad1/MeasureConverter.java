package zad1;

public class MeasureConverter {
    private final int MULTIPLICATION = 100;
    private final int SMALL_MULTIPLICATION = 10;

    private double meters;
    private double centimeters;
    private double milimeters;

    public  String convertValues(String inputMeters, String inputCentimeters, String inputMilimeters){
        String result = "";
        if(!inputMeters.equals("")){
            meters = Double.parseDouble(inputMeters);
            centimeters = meters*MULTIPLICATION;
            milimeters = centimeters*SMALL_MULTIPLICATION;
        } else if(!inputCentimeters.equals("")){
            centimeters = Double.parseDouble(inputCentimeters);
            meters = centimeters/MULTIPLICATION;
            milimeters = centimeters*SMALL_MULTIPLICATION;
        } else if(!inputMilimeters.equals("")){
            milimeters = Double.parseDouble(inputMilimeters);
            centimeters = milimeters/SMALL_MULTIPLICATION;
            meters = centimeters/MULTIPLICATION;
        }
        result = "<h1>Podana Wartość w przeliczeniu na: </h1><br><h2>Metry: " + String.valueOf(meters)+"</h2><br>" + " <h2>centymetry: " + String.valueOf(centimeters) + "</h2><br><h2>milimetry " + String.valueOf(milimeters)+"</h2><br>";
        return result;
    }

}
