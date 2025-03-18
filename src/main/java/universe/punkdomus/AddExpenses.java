package universe.punkdomus;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addExpense")
public class AddExpenses  extends HttpServlet {

    @Override 
    public void service(HttpServletRequest request, HttpServletResponse response) {
        //...
    }
}
