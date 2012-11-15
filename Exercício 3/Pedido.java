import java.util.*;
public class Pedido {
	
	private long numeroDoPedido;
	private Cliente cliente;
	private List<ItemDePedido> itens;
	
	public Pedido (long numeroDoPedido){
		this.numeroDoPedido = numeroDoPedido;
		this.cliente = new Cliente ("");
		this.itens = new ArrayList<ItemDePedido>();
	}
	public Pedido (long numeroDoPedido, String nome){
		this.numeroDoPedido = numeroDoPedido;
		this.cliente = new Cliente (nome);
		this.itens = new ArrayList<ItemDePedido>();
	}
	public long getNumeroDoPedido() {
		return numeroDoPedido;
	}

	public void setNumeroDoPedido(long numeroDoPedido) {
		this.numeroDoPedido = numeroDoPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemDePedido> getItens() {
		return itens;
	}

	public void adicionaItem (ItemDePedido item){
		this.itens.add(item);
	}
	public double getValorTotal(){
		double valor = 0;
		for (ItemDePedido cont: this.itens){
			valor+= cont.getSubTotal(); 
		}
		return valor;
	}
}
