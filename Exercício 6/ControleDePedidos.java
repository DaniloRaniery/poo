import java.io.IOException;
import java.util.*;

/** Esta classe implementa a interface InterfaceSistemaDeContrle.
 * 
 * @author Danilo
 */

public class ControleDePedidos implements InterfaceSistemaDeControle {
	
	private List<Pedido> pedidos;
	private GravadorDePedidos gravador;

	/**
	 * Este construtor inicializa a inst�ncia pedidos como uma lista do tipo ArrayList.
	 */
	
	public ControleDePedidos (){
		gravador = new GravadorDePedidos();
		leArquivo();
	}
	
	/**
	 * Este m�todo recebe um objeto do tipo Pedido e o adiciona a lista pedidos.
	 * 
	 * @param p Recebe um objeto do tipo Pedido.
	 */
	
	public void adicionaPedido (Pedido p){
		this.pedidos.add(p);
	}
	
	/**
	 * Este m�todo pesquisa pedidos utilizando o c�digo do produto passado como par�metro e
	 * retorna um ArrayList do tipo Pedido contendo os pedidos encontrados.
	 * 
	 * @param codProduto Recebe o c�digo do produto, do tipo String.
	 * @return Retorna uma lista do tipo Pedido contendo os pedidos encontrados.
	 */
	
	public List<Pedido> pesquisaIncluindoProduto (String codProduto){
		List<Pedido> retorno = new ArrayList<Pedido>();
		for(Pedido cont : this.pedidos){
			for (ItemDePedido aux : cont.getItens()){
				if (aux.getCodProduto().equals(codProduto)){
					retorno.add(cont);
				}
			}
		}
		return retorno;
	}
	
	/**
	 * Este m�todo recebe o n�mero de um pedido como par�metro e o remove da lista.
	 *
	 *@param numPedido Recebe o n�mero do pedido, do tipo long.
	 */
	
	public void removePedido (long numPedido){
		for (Pedido cont: this.pedidos){
			if (cont.getNumeroDoPedido() == numPedido){
				this.pedidos.remove(cont);
			}
		}
	}
	
	/**
	 * Este m�todo calcula a quantidade de pedidos de um determinado cliente.
	 * 
	 * @param nomeCliente Recebe o nome do cliente, do tipo String.
	 * @return Retorna a quantidade de pedidos do cliente.
	 */
	
	public int calculaQuantidadeDePedidosDoCliente(String nomeCliente){
		int contador = 0;
		for (Pedido cont: this.pedidos){
			if (cont.getCliente().getNome().equals(nomeCliente)){
				contador++;
			}
		}
		return contador;
	}
	public List<Pedido> getPedidos(){
		return this.pedidos;
	}
	
	public void gravarArquivos(){
		try{
			this.gravador.gravaPedidos(this.pedidos);
		}
		catch (IOException exc){
			System.err.println("N�o foi poss�vel gravar os pedidos.");
		}
	}
	
	public void leArquivo(){
		try{
			this.pedidos = this.gravador.lePedidos();
		}
		catch(IOException exc){
			this.pedidos = new ArrayList<Pedido>();
		}
	}
}
