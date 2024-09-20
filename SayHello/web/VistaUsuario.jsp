
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
         <table>
            <tr>
                <td>DNI</td><td><input type="text", name="dni", size="", value='<%=f[0]%>'/></td>
            </tr>
            <tr>
                <td>NOMBRE</td><td><input type="text", name="nom", size="", value='<%=f[1]%>'/></td>
            </tr>
            <tr>
                <td>APELLIDO</td><td><input type="text", name="ape", size="", value='<%=f[2]%>'/></td>
            </tr>
            <tr>


            

            <tr>
                <td><input type="submit", name="acc", value="Nuevo"/></td>
                <td><input type="submit", name="acc", value="Grabar"/></td>
                <td><input type="submit", name="acc", value="Buscar"/></td>

            </tr>            
        </table>
        </form>        
        <h3><%=msg%></h3>
        
        
        
    </body>
</html>
