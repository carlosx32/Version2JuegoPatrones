<%-- 
    Document   : VistaPersonaje
    Created on : 25/02/2017, 04:12:12 PM
    Author     : carandy
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="mainStyle.css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>NiCa</title>
    
    <script type="text/javascript">
      <%=(String)session.getAttribute("Script")%>  
    </script>
    
  </head>
  <body onload="dibujarCanvas()">
      <header>
          <h1><a href="index.jsp"> World Of CaNi </a></h1>
        </header>

      <canvas  id="miCanvas" width="900" height="900">Su navegador no soporta Canvas.</canvas>

        
  </body>
</html>
