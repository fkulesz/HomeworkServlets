package zad1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/convertWeight")
public class WeightConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String inputKilogramsAsString = request.getParameter("kilograms");
        String inputGramsAsString = request.getParameter("grams");
        String inputMiligramsAsString = request.getParameter("miligrams");

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        String result = "";

        boolean isFormValid = validateInputData(inputKilogramsAsString, inputGramsAsString, inputMiligramsAsString);
        if(isFormValid){
            WeightConverter converter = new WeightConverter();
            result = converter.convertValues(inputKilogramsAsString, inputGramsAsString, inputMiligramsAsString);

        } else {
            result = "<h1>Powinno zostać wypełnione tylko jedno pole!</h1>";
        }
        writer.println(result);
    }

    private boolean validateInputData(String inputKilograms, String inputGrams, String inputMiligrams){
        boolean isCorrectValue = true;
        if(!inputKilograms.equals("") && !inputGrams.equals("")){
            isCorrectValue = false;
        } else if(!inputKilograms.equals("") && !inputMiligrams.equals("")){
            isCorrectValue = false;
        } else if(!inputMiligrams.equals("") && !inputGrams.equals("")){
            isCorrectValue = false;
        } else {
            isCorrectValue = true;
        }
        return  isCorrectValue;
    }


}
