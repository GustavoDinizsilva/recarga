package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.RecargaDao;


@WebServlet("/ControleRecarga")
public class ControleRecarga extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ControleRecarga() {
        super();
        
    }

	
	protected void execute (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String escolha = request.getParameter("escolha");
		
		if (escolha == "todas") {
			RecargaDao dao = new RecargaDao();
			try {
				dao.listar();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} else {
			RecargaDao dao = new RecargaDao();
			try {
				dao.listarBaseadoNoStatus(escolha);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	

}
