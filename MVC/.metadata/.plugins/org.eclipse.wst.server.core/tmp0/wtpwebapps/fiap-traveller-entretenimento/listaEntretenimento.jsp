<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page
	import="java.util.List, br.com.travellerfiap.entretenimento.servlet.Entretenimento"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Traveller - Listagem de Entretenimento</title>
</head>
<body>
<h1>Listagem de Entretenimento </h1>
<table border="1">
    <tr>
        <th>Nome do Entretenimento</th>
        <th>Horário de Funcionamento</th>
        <th>Localização</th> 
        <th>Nota Avaliação</th> 
        <th>Ações</th>
    </tr>
       
  	<c:forEach items="${entretenimento}" var="entretenimento">
  		<tr>
	  		<td><a href="${entretenimento.urlSiteOficial}" title="${entretenimento.descricao}"> ${entretenimento.nome}</a></td>
	  		<td>${entretenimento.horarioFuncionamento}</td>
	  		<td>${entretenimento.localizacao}</td>
  			<td>${entretenimento.avaliacao}</td>
	  		<td>
				<a href="/fiap-traveller-entretenimento/mostraDetalheEntretenimento?id=${entretenimento.id}">Alterar </a>
			   	<a href="/fiap-traveller-entretenimento/removeEntretenimento?id=${entretenimento.id}">Excluir </a>
			</td>
  		</tr>
	</c:forEach>

   
</table>

	<!--<ul> -->
		
	<!--  passo 1 for (Entretenimento entretenimento:listaEntretenimento) {
			out.println("<li>" + entretenimento.getNome() + "</li>");
			System.out.println(entretenimento.getNome());
		}-->
		
		<!-- Passo 2 ajustar código para que o HTML entenda código Java
		<%
		List<Entretenimento> entretenimentos = (List<Entretenimento>) request.getAttribute("entretenimento");
		for (Entretenimento entretenimento:entretenimentos) {
		%>
			<li> <%= entretenimento.getNome()%>
			</li>
		
		<% }
		%> -->
		
	<!-- 	<c:forEach items="${entretenimentos}" var="entretenimento">
			<li>${entretenimento.nome}</li>
		</c:forEach> -->
		
	
	
	<!-- <c:forEach items="${parques}" var="parque">
			<li><a href="ssss=" title="${parque.descricao}">${parque.nome}</a></li>
		</c:forEach>
		
	</ul> -->	

</body>
</html>