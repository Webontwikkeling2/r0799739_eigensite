package ui.controller;

import domain.db.ToestelDB;
import domain.model.Toestel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Toestellen")
public class Toestellen extends HttpServlet {
    private String destination;
    private ToestelDB databank = new ToestelDB();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String naam = request.getParameter("Tnaam");
        String bouwjaar = request.getParameter("bouwjaar");
        String leverancier = request.getParameter("leverancier");
        String opslag = request.getParameter("opslag");
        String aantal = request.getParameter("aantal");

        if (!naam.isEmpty() && !bouwjaar.isEmpty() && !leverancier.isEmpty() && !opslag.isEmpty() && !aantal.isEmpty()){
            databank.add(new Toestel(naam, leverancier, Integer.parseInt(opslag), Integer.parseInt(aantal), Integer.parseInt(bouwjaar)));
            doGet(request, response);
        }else{
            request.setAttribute("error", "U moet alle verplichte velden invullen.");
            destination = "toevoegen.jsp";
            RequestDispatcher view = request.getRequestDispatcher("toevoegen.jsp");
            view.forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("toestellen", databank.getToestellen());
        request.setAttribute("aantal", databank.getTotaalAantalToestellen());

        RequestDispatcher view = request.getRequestDispatcher("overview.jsp");
        view.forward(request, response);
    }
}
