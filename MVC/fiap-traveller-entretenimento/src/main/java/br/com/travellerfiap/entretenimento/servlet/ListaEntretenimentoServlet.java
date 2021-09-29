package br.com.travellerfiap.entretenimento.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/listaEntretenimento")
public class ListaEntretenimentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
				
		List<Entretenimento> listaEntretenimento = banco.getEntretenimento();
				
		request.setAttribute("entretenimento", listaEntretenimento);
				
		RequestDispatcher rd = request.getRequestDispatcher("/listaEntretenimento.jsp");
				
		rd.forward(request, response);
		

	
	}

}