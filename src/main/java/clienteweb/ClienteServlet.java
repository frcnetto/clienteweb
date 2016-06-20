package clienteweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/cliente")
public class ClienteServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("AQUI É GET PORRA! BIIIIRRRRRRLLLLLL");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//System.out.println("AQUI É POST PORRA! BIIIIRRRRRRLLLLLL");
		resp.getWriter().print("TA SAINDO DA JAULA O POST PORRA! BIIIIRRRRRLLLLLL");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter().print("TA SAINDO DA JAULA O DELETE PORRA! BIIIIRRRRRLLLLLL");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter().print("TA SAINDO DA JAULA O PUT PORRA! BIIIIRRRRRLLLLLL");
	}
}
