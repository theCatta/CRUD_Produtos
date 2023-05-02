package produtos;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alteraProd")
public class AlteraProdServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("Alterando produto");
		
		String nomeProd = request.getParameter("nome");
		String unidProdStg = request.getParameter("unidadeCompra");
		String descProd = request.getParameter("descricao");
		String prevProdStg = request.getParameter("qtdPrevistoMes");
		String maxProdStg = request.getParameter("precoMaxComprado");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
		Banco banco = new Banco();
		produto prod = banco.srcProd(id);
		
		prod.setNome(nomeProd);
	 	//prod.setUnidadeCompra(unidProdStg); 
		prod.setDescricao(descProd);
		//prod.setQtdPrevistoMes(prevProdStg);
		//prod.setPrecoMaxComprado(maxProdStg);
		
		response.sendRedirect("listaProdutos");
	}
}
