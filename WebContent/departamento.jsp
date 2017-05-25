<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mantenimiento Proveedor</title>
</head>
<body>

<div align="center">
<form action = "" method = "post">
	<table>
		<tr><th colspan ="2">Registrar Proveedor</th></tr>
		<tr>
			<td align="right">Razón Social</td>
			<td><input type = "text" name = "rs"/></td>
		</tr>
		<tr>
			<td align="right">RUC</td>
			<td><input type = "text" name = "ruc"></td>
		</tr>
		<tr>
			<td align="right">Teléfono</td>
			<td><input type = "text" name = "fono"/></td>
		</tr>
		<tr>
			<td align="right">Dirección</td>
			<td><input type = "text" name = "direccion"/></td>
		</tr>
		<tr>
			<td align="right">Estado</td>
			<td><input type = "radio" name = "estado" value= "1"/>Activo
				<input type = "radio" name = "estado" value= "0"/>Inactivo
			</td>
		</tr>
		<tr>
			<td colspan = "2" align = "center"><input type = "submit" name = "guardar" value = "Registrar"/></td>
		</tr>
</table>
</form>
</div>

</body>
</html>