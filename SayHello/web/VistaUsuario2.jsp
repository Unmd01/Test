
<%@page import="presentacion.Presentador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <h1>Saludo</h1>
        <% Presentador pres=(Presentador)session.getAttribute("pres"); %>
        <% String msg=pres.getMsg(); %>
        <% Object []f =pres.getFil(); %>     
        <form action="Control" method="Post">


        <textarea 
        rows="5" 
        cols="50" 
        disabled
        style="font-size: 24px; width: 100%; border: none; padding: 10px;">
        Hola <%=f[1]%> <%=f[2]%>, Espero que tu día esté yendo genial.
         </textarea>

            

            <tr>
                <td><input type="submit", name="acc", value="Regresar"/></td>
               

            </tr>            

        </form>        
        <h3><%=msg%></h3>
        
        
        
    </body>
</html>
