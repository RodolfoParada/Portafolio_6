<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Captura Datos</title>
 </head>
 <body>
 <%@ page import="cl.controller.muestraRegistro" %> 
 <h1>Hola! Proporciona tus datos:</h1>
 <form action="MuestraRegistro" method="post">
 <table cellspacing="3" cellpadding="3" border="1" >
 <tr>
 <td align="right"> Nombre: </td>
 <td><input type="text" name="nombre"></td> 
 </tr> 
 <tr>
 <td align="right"> Apellidos: </td> 
 <td> <input type="text" name="apellidos"> </td> 
 </tr>
 <tr>
 <td align="right"> Promedio: </td> 
 <td> <input type="text" name="prom"> </td> 
 </tr> 
 </table>
 
 <input type="reset" value="Borrar">
 <input type="submit" value="Enviar">
 </form>
 </body>
</html>