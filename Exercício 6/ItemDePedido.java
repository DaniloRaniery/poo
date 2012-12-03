public class ItemDePedido {
	
	private int quantidade;
	private String codProduto;
	private double valorUnitario;
	
	public ItemDePedido(String cod, int quant, double valor){
		this.codProduto = cod;
		this.quantidade = quant;
		this.valorUnitario = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public double getSubTotal(){
		double valor = (this.quantidade*this.valorUnitario);
		return valor;
	}	
}
