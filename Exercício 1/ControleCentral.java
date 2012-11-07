import java.util.*;
public class ControleCentral {

	public static void main(String[] args) {
		
		ControleDePedidos controle = new ControleDePedidos();
		
		Pedido p1 = new Pedido (0010, "Ayla");
		Pedido p2 = new Pedido (0020, "Ayla");
		
		controle.adicionaPedido(p1);
		controle.adicionaPedido(p2);
		
		int contador = controle.calculaQuantidadeDePedidosDoCliente("Ayla");
		
		if (contador == 2){
			System.out.println ("Programa correto");			
		}
		else{
			System.out.println ("Programa incorreto");		
		}	
	}
}
