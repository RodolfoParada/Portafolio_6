<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Ingreso al sistema</title>
 </head>
 <body>
 <h1>Bienvenido al sistema de Login!</h1>
 <%@ page import="Controller.login" %> 
 <h3> Introduce tu cuenta y tu contraseña</h3>
 <form action="login" method="post">
 <table cellspacing="3" cellpadding="3" border="1" >
 <tr>
 <td align="right"> Cuenta: </td>
 <td><input type="text" name="cuenta"></td> 
 </tr> 
 <tr>
 <td align="right"> Nombre: </td>
 <td><input type="text" name="nombre"></td> 
 </tr> 
 <tr>
 <td align="right"> Contraseña: </td>
 <td><input type="password" name="clave"></td> 
 </tr>
 <tr>
 <td align="right"> Email: </td>
 <td><input type="text" name="mail"></td> 
 </tr>  
 </table>
 
 <form action="inicioSistema.jsp" method="post">
 <input type="reset" value="Borrar">
 <input type="submit" value="Ingresar">
 </form>
 
 <form action="llenaRegistro.jsp" method="post">
 <input type="submit" value="Registrar">
 </form>
  </form>
 </body>
 </html>