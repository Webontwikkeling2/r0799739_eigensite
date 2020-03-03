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
    private ToestelDB Databank = new ToestelDB();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("toestellen", Databank.getToestellen());
        request.setAttribute("aantal", Databank.getTotaalAantalToestellen());

        RequestDispatcher view = request.getRequestDispatcher("overview.jsp");
        view.forward(request, response);
    }
}
