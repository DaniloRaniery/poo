import java.util.*;

/** Esta interface serve para criar sistemas de controle de pedidos.
 * @author Danilo
 */

public interface InterfaceSistemaDeControle {
	
	/** Este método adiciona um pedido.
	 * 
	 * @param p Recebe um objeto do tipo Pedido.
	 */
	
	public void adicionaPedido (Pedido p);
	
	/** Este método pesquisa pedidos utilizando o código do produto.
	 * 
	 * @param codProduto Recebe um objeto do tipo String que representa o código do produto.
	 * @return Este método retorna uma Lista do tipo Pedido contendo todos os produtos que têm o código 
	 *  igual ao passado no parametro.
	 */
	
	public List<Pedido> pesquisaIncluindoProduto (String codProduto);
	
	/** Este método remove um pedido.
	 * 
	 * @param numPedido Este método do tipo long recebe o número do pedido que será removido.
	 */
	public void removePedido (long numPedido);
	
}
