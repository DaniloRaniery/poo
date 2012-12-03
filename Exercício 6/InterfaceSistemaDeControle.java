import java.util.*;

/** Esta interface serve para criar sistemas de controle de pedidos.
 * @author Danilo
 */

public interface InterfaceSistemaDeControle {
	
	/** Este m�todo adiciona um pedido.
	 * 
	 * @param p Recebe um objeto do tipo Pedido.
	 */
	
	public void adicionaPedido (Pedido p);
	
	/** Este m�todo pesquisa pedidos utilizando o c�digo do produto.
	 * 
	 * @param codProduto Recebe um objeto do tipo String que representa o c�digo do produto.
	 * @return Este m�todo retorna uma Lista do tipo Pedido contendo todos os produtos que t�m o c�digo 
	 *  igual ao passado no parametro.
	 */
	
	public List<Pedido> pesquisaIncluindoProduto (String codProduto);
	
	/** Este m�todo remove um pedido.
	 * 
	 * @param numPedido Este m�todo do tipo long recebe o n�mero do pedido que ser� removido.
	 */
	public void removePedido (long numPedido);
	
}
