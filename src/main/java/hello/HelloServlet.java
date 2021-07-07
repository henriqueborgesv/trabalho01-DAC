/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

/**
 *
 * @author viter
 */
@WebServlet("/alomundo")
public class HelloServlet extends HttpServlet {
    LocalDateTime date = LocalDateTime.now();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the
    // + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String msg = "";
        String msg2 = "";

        String lang = request.getParameter("lang");
        if (lang == null)
            lang = "pt";
        switch (lang) {
            case "pt":
                if (this.date.getHour() > 6 && this.date.getHour() < 12) {
                    msg = "Bom dia, ";
                } else if (this.date.getHour() > 12 && this.date.getHour() < 18) {
                    msg = "Boa tarde, ";
                } else {
                    msg = "Boa noite, ";
                }
                break;
            case "en":
                if (this.date.getHour() > 6 && this.date.getHour() < 12) {
                    msg = "Good morning, ";
                } else if (this.date.getHour() > 12 && this.date.getHour() < 18) {
                    msg = "Good afternoon, ";
                } else {
                    msg = "Good evening, ";
                }
                break;
            case "fr":
                if (this.date.getHour() > 6 && this.date.getHour() < 12) {
                    msg = "Bonjour, ";
                } else if (this.date.getHour() > 12 && this.date.getHour() < 18) {
                    msg = "Bonsoir, ";
                } else {
                    msg = "Bonne nuit, ";
                }
                break;
            case "de":
                if (this.date.getHour() > 6 && this.date.getHour() < 12) {
                    msg = "Guten Morgen, ";
                } else if (this.date.getHour() > 12 && this.date.getHour() < 18) {
                    msg = "Guten Tag, ";
                } else {
                    msg = "Gute Nacht, ";
                }
                break;
            case "es":
                if (this.date.getHour() > 6 && this.date.getHour() < 12) {
                    msg = "Buen dia, ";
                } else if (this.date.getHour() > 12 && this.date.getHour() < 18) {
                    msg = "Buenas tardes, ";
                } else {
                    msg = "Buenas noches, ";
                }
                break;
            case "ho":
                if (this.date.getHour() > 6 && this.date.getHour() < 12) {
                    msg = "Goedemorgen, ";
                } else if (this.date.getHour() > 12 && this.date.getHour() < 18) {
                    msg = "Goedenmiddag, ";
                } else {
                    msg = "Welterusten, ";
                }
                break;
        }

        String nome = request.getParameter("nome");

        if (nome == null)
            nome = "Fulano";

        msg = msg + nome + "!";

        String altura = request.getParameter("altura");
        String peso = request.getParameter("peso");

        if (altura == null || peso == null)
            msg2 = "Não conseguimos calcular seu IMC.";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet</h1>");
            out.println("<p>" + msg + "</p>");
            out.println("<p>" + msg2 + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String msg = "";

        String lang = request.getParameter("lang");
        if (lang == null)
            lang = "pt";
        switch (lang) {
            case "pt":
                if (this.date.getHour() > 6 && this.date.getHour() < 12) {
                    msg = "Bom dia, ";
                } else if (this.date.getHour() > 12 && this.date.getHour() < 18) {
                    msg = "Boa tarde, ";
                } else {
                    msg = "Boa noite, ";
                }
                break;
            case "en":
                if (this.date.getHour() > 6 && this.date.getHour() < 12) {
                    msg = "Good morning, ";
                } else if (this.date.getHour() > 12 && this.date.getHour() < 18) {
                    msg = "Good afternoon, ";
                } else {
                    msg = "Good evening, ";
                }
                break;
            case "fr":
                if (this.date.getHour() > 6 && this.date.getHour() < 12) {
                    msg = "Bonjour, ";
                } else if (this.date.getHour() > 12 && this.date.getHour() < 18) {
                    msg = "Bonsoir, ";
                } else {
                    msg = "Bonne nuit, ";
                }
                break;
            case "de":
                if (this.date.getHour() > 6 && this.date.getHour() < 12) {
                    msg = "Guten Morgen, ";
                } else if (this.date.getHour() > 12 && this.date.getHour() < 18) {
                    msg = "Guten Tag, ";
                } else {
                    msg = "Gute Nacht, ";
                }
                break;
            case "es":
                if (this.date.getHour() > 6 && this.date.getHour() < 12) {
                    msg = "Buen dia, ";
                } else if (this.date.getHour() > 12 && this.date.getHour() < 18) {
                    msg = "Buenas tardes, ";
                } else {
                    msg = "Buenas noches, ";
                }
                break;
            case "ho":
                if (this.date.getHour() > 6 && this.date.getHour() < 12) {
                    msg = "Goedemorgen, ";
                } else if (this.date.getHour() > 12 && this.date.getHour() < 18) {
                    msg = "Goedenmiddag, ";
                } else {
                    msg = "Welterusten, ";
                }
                break;
        }

        String nome = request.getParameter("nome");

        if (nome == null)
            nome = "Fulano";

        msg = msg + nome + "!";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet</h1>");
            out.println("<p>" + msg + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
