package produtos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	private static List<produto> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		
		produto default1=new produto();
		default1.setId(chaveSequencial++);
		default1.setNome("Default");
		default1.setDescricao("Componente utilizado apenas para teste");
		default1.setUnidadeCompra(99);
		default1.setPrecoMaxComprado(99);
		default1.setQtdPrevistoMes(99);
		lista.add(default1);
		
	}
	
		//Adicionar a lista
		public void addProd(produto prod) {
			prod.setId(Banco.chaveSequencial++);
			Banco.lista.add(prod);
		}
		//Listar produtos
		public List<produto> getProdutos() {
			return Banco.lista;
		}
		//remover produtos
		public void rmvProd(long  id) {
			Iterator<produto> it= lista.iterator();
			while(it.hasNext()){			
				produto pdt=it.next();		
				if(pdt.getId()==id) {
					it.remove();
				}
				
			}
		}	
		//retornar produto
		public produto srcProd(long id) {
			for(produto prod:lista) {
				if(prod.getId()==id) {
					return prod;
				}
			}
			return null;		
		}
}


