import java.util.*;
import java.io.*;

import javax.swing.JOptionPane;

public class Exercicio6 {
	
	public static void main (String args[]){
		
		Scanner teclado = new Scanner(System.in);
		ControleDePedidos controle = new ControleDePedidos();
		Pedido pedido = new Pedido(1);
		int escolha = 0;
		
		do{
			System.out.println("1 - Adicionar pedido\n2 - Remover pedido\n3 - Sair");
			escolha = teclado.nextInt();
			switch (escolha){
				case 1:
						System.out.println("Digite o código do produto: ");
						String codigoDoProduto = teclado.next();
						System.out.println("Digite a quantidade do produto: ");
						String quantidade = teclado.next();
						System.out.println("Digite o valor unitário do produto: ");
						String valorUnitario = teclado.next();
						ItemDePedido item = new ItemDePedido(codigoDoProduto, Integer.parseInt(quantidade),Double.parseDouble(valorUnitario));
						pedido.adicionaItem(item);
					break;
				case 2:
					System.out.println("Digite o número do produto: ");
					long numeroDoProduto = teclado.nextLong();
					controle.removePedido(numeroDoProduto);
					break;
			}
		} while(escolha!=3);
		
		controle.gravarArquivos();
	}
}

