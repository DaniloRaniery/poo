import java.util.*;
public interface InterfaceSistemaDeControle {
	public void adicionaPedido (Pedido p);
	public List<Pedido> pesquisaIncluindoProduto (long codProduto);
	public void removePedido (long numPedido);
	
}
