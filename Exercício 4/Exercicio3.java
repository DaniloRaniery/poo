package br.ufpb.sistemapedidos;
import java.util.*;
public class Exercicio3 {
	
	public static void main (String args[]){
		String codigoDoProduto = "";
		Scanner teclado = new Scanner(System.in);
		Pedido pedido1 = new Pedido(1);

		while (!codigoDoProduto.equals("0")){
			codigoDoProduto = teclado.nextLine();
			if (codigoDoProduto.equals("0")){
				break;
			}
			String quantidade = teclado.nextLine();
			String valorUnitario = teclado.nextLine();
			
			ItemDePedido item = new ItemDePedido(codigoDoProduto, Integer.parseInt(quantidade),Double.parseDouble(valorUnitario));
			pedido1.adicionaItem(item);
		}
		System.out.println("Valor Total: R$"+ pedido1.getValorTotal());
	}
}

