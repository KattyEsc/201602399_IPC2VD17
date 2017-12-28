/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Katty
 */
public class Scategoria extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String op=request.getParameter("op");
        String pagina;
        if(op.equals("asociacion")){
            
           pagina="/categorias/asociacion.jsp";
           RequestDispatcher dispatcher= getServletContext().getRequestDispatcher(pagina);
           dispatcher.forward(request, response);
           
        }else if(op.equals("habilidad")){
            
           pagina="/categorias/habilidad.jsp";
           RequestDispatcher dispatcher= getServletContext().getRequestDispatcher(pagina);
           dispatcher.forward(request, response);
           
        }else if(op.equals("proyectotarea")){
            
           pagina="/categorias/proytar.jsp";
           RequestDispatcher dispatcher= getServletContext().getRequestDispatcher(pagina);
           dispatcher.forward(request, response);
           
        }else if(op.equals("perfil")){
            
           pagina="/categorias/perfil.jsp";
           RequestDispatcher dispatcher= getServletContext().getRequestDispatcher(pagina);
           dispatcher.forward(request, response);
           
        }else if(op.equals("salir")){
            
           pagina="/index.jsp";
           RequestDispatcher dispatcher= getServletContext().getRequestDispatcher(pagina);
           dispatcher.forward(request, response);
            
        }else{
            
           pagina="/principal.jsp";
           RequestDispatcher dispatcher= getServletContext().getRequestDispatcher(pagina);
           dispatcher.forward(request, response);
           
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
