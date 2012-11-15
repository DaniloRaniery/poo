import java.util.*;
public class ControleDePedidos implements InterfaceSistemaDeControle {
	
	private List<Pedido> pedidos;
	
	public ControleDePedidos (){
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public void adicionaPedido (Pedido p){
		this.pedidos.add(p);
	}
	public List<Pedido> pesquisaIncluindoProduto (long codProduto){
		List<Pedido> retorno = new ArrayList<Pedido>();
		for(Pedido cont : pedidos){
			for (ItemDePedido aux : cont.getItens()){
				if (aux.getCodProduto().equals(codProduto)){
					retorno.add(cont);
				}
			}
		}
		return retorno;
	}
	
	public void removePedido (long numPedido){
		for (Pedido cont: this.pedidos){
			if (cont.getNumeroDoPedido() == numPedido){
				this.pedidos.remove(cont);
			}
		}
	}
	public int calculaQuantidadeDePedidosDoCliente(String nomeCliente){
		int contador = 0;
		for (Pedido cont: this.pedidos){
			if (cont.getCliente().getNome().equals(nomeCliente)){
				contador++;
			}
		}
		return contador;
	}
	
}
