package front;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.JoinCommand;
import command.LoginCommand;
import command.UpdateCommand;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HashMap<String, ICommand> map = new HashMap<String, ICommand>();
	
	public void inputMap() {
		map.put("loginService.do", new LoginCommand());
		map.put("joinService.do",  new JoinCommand());
		map.put("updateService.do", new UpdateCommand());
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String resultURL = requestURI.substring(contextPath.length()+1);
		request.setCharacterEncoding("EUC-KR");
		
		inputMap();
		
		String moveURL = null; 
		ICommand iCommand = map.get(resultURL);
		moveURL = iCommand.execute(request, response);
		response.sendRedirect(moveURL);
	}

}
