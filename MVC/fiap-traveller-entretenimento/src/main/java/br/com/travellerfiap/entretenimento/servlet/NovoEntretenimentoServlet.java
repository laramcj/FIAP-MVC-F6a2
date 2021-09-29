package br.com.travellerfiap.entretenimento.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novoEntretenimento")
public class NovoEntretenimentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeEntretenimento = request.getParameter("nome");
		
		Entretenimento entretenimento = new Entretenimento();
		entretenimento.setNome(nomeEntretenimento);
		
		Banco banco = new Banco();
		banco.adiciona(entretenimento);
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("O " + nomeEntretenimento + " foi cadastrado com sucesso !");
		out.println("</body>");
		out.println("</html>");
	}

}
