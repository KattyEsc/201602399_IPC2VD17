<%-- 
    Document   : principal
    Created on : 26-dic-2017, 22:20:47
    Author     : Katty
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include  file="WEB-INF/jspf/jscss.jspf"%>
        
        <title>Warlock Soft</title>
	
        <%--    <script type="text/javascript">
		alert("Bienvenido a Warlock Soft!");
	</script> --%>
</head>
<body>
    
    <h1>Bienvenido
        <jsp:useBean id="validUsuario" scope="session" class="ws.Empleado" />
        <jsp:getProperty name="validUsuario" property="nombre" />
    </h1> 
		
		<footer></footer>

		<script src="js/jquery.js"></script>
		<script src="js/bootstrap.min.js"></script>
                
                <%@include  file="WEB-INF/jspf/top.jspf"%>
                <div>
                    
                </div>
                <%@include  file="WEB-INF/jspf/bottom.jspf"%>
</body>
</html>
