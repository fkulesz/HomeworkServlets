package zad1;

public class WeightConverter {
   private final int MULTIPLICATION = 1000;

   private double kilograms;
   private double grams;
   private double miligrams;

    public  String convertValues(String inputKilograms, String inputGrams, String inputMiligrams){
        String result = "";

        if(!inputKilograms.equals("")){
            kilograms = Double.parseDouble(inputKilograms);
            grams = kilograms*MULTIPLICATION;
            miligrams = grams*MULTIPLICATION;
        } else if(!inputGrams.equals("")){
            grams = Double.parseDouble(inputGrams);
            kilograms = grams/MULTIPLICATION;
            miligrams = grams*MULTIPLICATION;
        } else if(!inputMiligrams.equals("")){
            miligrams = Double.parseDouble(inputMiligrams);
            grams = miligrams/MULTIPLICATION;
            kilograms = grams/MULTIPLICATION;
        }
        result = "<h1>Podana Wartość w przeliczeniu na: </h1><br><h2>Kilogramy: " + String.valueOf(kilograms)+"</h2><br>" + " <h2>Gramy: " + String.valueOf(grams) + "</h2><br><h2>Miligramy " + String.valueOf(miligrams)+"</h2><br>";
        return result;
    }

}
