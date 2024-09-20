
package presentacion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Usuario;
import servicio.Servicio;
import servicio.ServicioImp;


@WebServlet(name = "Control", urlPatterns = {"/Control"})
public class Control extends HttpServlet {
    private Presentador pres;
    private Servicio serv; 


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acc= request.getParameter("acc");
        if(acc.equals("Nuevo")){
            pres=new Presentador();
            serv= new ServicioImp();
            request.getSession().setAttribute("pres", pres);
            response.sendRedirect("VistaUsuario.jsp");        

        }
        if(acc.equals("Grabar")){
        String dni= request.getParameter("dni");
        String nom= request.getParameter("nom");
        String ape= request.getParameter("ape");
        String msg=serv.grabar(dni, nom,ape);
        pres.setMsg(msg);
        response.sendRedirect("VistaUsuario.jsp");        

        }  
     if(acc.equals("Buscar")){
        String dni= request.getParameter("dni");
        Usuario usua=serv.buscar(dni);
        if(usua!=null){
            Object[]f=new Object [3];
            f[0]=usua.getDni();
            f[1]=usua.getNom();
            f[2]=usua.getApe();            
            pres.setFil(f);
        }else{
            pres.setMsg("Usuario no encontrado");
        }
        response.sendRedirect("VistaUsuario2.jsp");        

        }
        if(acc.equals("Regresar")){
        
        response.sendRedirect("VistaUsuario.jsp");        

        }
     
     
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
        processRequest(request, response);
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
