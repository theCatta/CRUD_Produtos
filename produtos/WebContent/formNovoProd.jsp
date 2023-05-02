<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/novoProd" var ="linkServletNovoProd"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
</head>

<body>
	<form action="${linkServletNovoProd }" method="post">
		
		Nome: <input type="text" name="nome" />
		Unidades: <input type="text" name="unidadeCompra" />
		Descrição: <input type="text" name="descricao" />
		Previsão de compras mensais: <input type="text" name="qtdPrevistoMes" />
		Preço máximo comprado: <input type="text" name="precoMaxComprado" />
		
		<input type="submit" />
		
	</form>
</body>

</html>
