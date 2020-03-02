package ui.controller;

import domain.db.ToestelDB;
import domain.model.Toestel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;

@WebServlet("/Toestellen")
public class Toestellen extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ToestelDB Databank = new ToestelDB();

        Toestel LenovoLegion = new Toestel("Lenovo-Legion-512", "Lenovo", 512, 8, 2020);
        Toestel AppleMacbookPro = new Toestel("Apple-MacbookPro-1tb", "Apple", 1000, 1, 2017);
        Toestel MicrosoftSurface = new Toestel("Microsoft-surface-256", "Microsoft", 256, 2, 2019);

        Databank.add(LenovoLegion);
        Databank.add(AppleMacbookPro);
        Databank.add(MicrosoftSurface);

        request.setAttribute("toestellen", Databank.getToestellen());
        request.setAttribute("aantal", Databank.getTotaalAantalToestellen());

        RequestDispatcher view = request.getRequestDispatcher("overview.jsp");
        view.forward(request, response);
    }
}
