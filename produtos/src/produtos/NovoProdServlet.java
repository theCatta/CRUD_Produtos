package produtos;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novoProd")
public class NovoProdServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			System.out.println("Cadastrando novo produto");
			
			String nomeProd = request.getParameter("nome");
			String unidProdStg = request.getParameter("unidadeCompra");
			String descProd = request.getParameter("descricao");
			String prevProdStg = request.getParameter("qtdPrevistoMes");
			String maxProdStg = request.getParameter("precoMaxComprado");
			
			/*int unidProdInt = Integer.parseInt(unidProdStg);
			double prevProdDob = Double.parseDouble(prevProdStg);
			double maxProdDob = Double.parseDouble(maxProdStg);*/
			
			produto prod = new produto();
			prod.setNome(nomeProd);
		 	//prod.setUnidadeCompra(unidProdStg); 
			prod.setDescricao(descProd);
			//prod.setQtdPrevistoMes(prevProdStg);
			//prod.setPrecoMaxComprado(maxProdStg);
			
			Banco banco = new Banco();
			banco.addProd(prod);
			
			RequestDispatcher rd =
				request.getRequestDispatcher("/formNovoProd.jsp");
				request.setAttribute("produto", prod);
				rd.forward(request, response);
	}
}
