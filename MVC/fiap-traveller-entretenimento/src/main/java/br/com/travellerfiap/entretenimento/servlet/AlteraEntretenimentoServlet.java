package br.com.travellerfiap.entretenimento.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlteraEntretenimentoServlet
 */
@WebServlet("/alteraEntretenimento")
public class AlteraEntretenimentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Alterando empresa ");
		String nomeEntretenimento = request.getParameter("nome");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
		
		
		Banco banco = new Banco();
		
		Entretenimento entretenimento = banco.buscaPorId(id);
		entretenimento.setNome(nomeEntretenimento);
		
		
		response.sendRedirect("listaEntretenimento");
	}

}
