<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
</head>
<body>

	<div class="container">
		<div class="col-xs-6 col-xs-offset-3">
		
	
		
		
		
			<form action="contorleRecarga" method="get">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3>Controle de Recarga</h3>
					</div><br><br>
					<div>
						<select name="lista">
		  <option value="todas" selected>Todas</option>
		  <option value="ativa">Ativas</option>
		  <option value="cancelada">Canceladas</option>
		  <option value="pendente">Pendentes</option>
		</select>
		
		<br><br>
	
		<div class="panel-footer">
						<input type="submit" value="Buscar"  class="btn btn-info">
					</div>
						</div>
							
					</div>
					
				</div>
			</form>
		
		
</body>
</html>

