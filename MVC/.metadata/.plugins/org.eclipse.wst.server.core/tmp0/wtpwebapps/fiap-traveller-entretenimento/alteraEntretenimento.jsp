<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <c:url value = "/alteraEntretenimento" var="linkServletAlteraEntretenimento" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Traveller - Altera Entretenimento</title>
</head>
<body>
<form action="${linkServletAlteraEntretenimento}" method="post" >


Nome: <input type="text" name="nome" value="${entretenimento.nome}"/>
<input type="hidden" name="id" value="${entretenimento.id}" />
<input type="submit" />
</form>

</body>
</html>