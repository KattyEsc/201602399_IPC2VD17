
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include  file="../WEB-INF/jspf/jscss.jspf"%>
        <title>Warlock Soft</title>
    </head>
    <body>
        <h1>Hola de nuevo
        <jsp:useBean id="validUsuario" scope="session" class="ws.Empleado" />
        <jsp:getProperty name="validUsuario" property="nombre" />
    </h1> 
        <%@include  file="../WEB-INF/jspf/top.jspf"%>
            <div>
                Este es tu perfil...
            </div>
        <%@include  file="../WEB-INF/jspf/bottom.jspf"%>
    </body>
</html>
