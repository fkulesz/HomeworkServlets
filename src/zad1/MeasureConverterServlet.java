package zad1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet("/convertMeasure")
public class MeasureConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputMetersAsString = request.getParameter("meters");
        String inputCentimetersAsString = request.getParameter("centimeters");
        String inputMilimetersAsString = request.getParameter("milimeters");

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        String result = "";

        boolean isFormValid = validateInputData(inputMetersAsString, inputCentimetersAsString, inputMilimetersAsString);
        if(isFormValid){
            MeasureConverter converter = new MeasureConverter();
            result = converter.convertValues(inputMetersAsString, inputCentimetersAsString, inputMilimetersAsString);

        } else {
            result = "<h1>Powinno zostać wypełnione tylko jedno pole!</h1>";
        }
        writer.println(result);
    }

    private boolean validateInputData(String inputMeters, String inputCentimeters, String inputMilimeters){
        boolean isCorrectValue = true;
        if(!inputMeters.equals("") && !inputCentimeters.equals("")){
            isCorrectValue = false;
        } else if(!inputMeters.equals("") && !inputMilimeters.equals("")){
            isCorrectValue = false;
        } else if(!inputMilimeters.equals("") && !inputCentimeters.equals("")){
            isCorrectValue = false;
        } else {
            isCorrectValue = true;
        }
        return  isCorrectValue;
    }


}
