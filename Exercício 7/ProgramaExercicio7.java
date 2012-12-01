import javax.swing.*;
import java.util.*;
import java.io.*;

public class ProgramaExercicio7 {
		
	public static void main(String[] args) {
		
		AgendaIF agenda = null;
		GravadorDeContatos gravador = new GravadorDeContatos();
		String escolha2;
		String escolha = JOptionPane.showInputDialog ("Desejar criar a agenda em que formato:\n 1 - Lista\n 2 - Mapa");
		int esc1 = Integer.parseInt(escolha);
		int esc2;
		boolean condicao = true;
		
		do{
			if(esc1 ==1){
				try{
					agenda = new Agenda(new ArrayList<Contato>(gravador.recuperaContato()));
					System.out.println(agenda.getContatos());
				}
				catch(IOException exc){	
					agenda = new Agenda();
				}
				catch(NullPointerException exc){
					agenda = new Agenda();
				}
			}
			else if(esc1 == 2){
				try{
					List<Contato> lista = new ArrayList(gravador.recuperaContato());
					Map<String,Contato> mapa = new HashMap<String,Contato>();
					agenda = new AgendaMap();
					for(Contato cont: lista){
						mapa.put(cont.getNome(),cont);
					}
					agenda = new AgendaMap(new HashMap(mapa));
					System.out.println(agenda.getContatos());
					
				}
				catch(IOException exc){
					agenda = new AgendaMap();	
				}
				catch(NullPointerException exc){
					agenda = new AgendaMap();
				}
			}
		}while(esc1 != 1 && esc1 != 2);
		
		do{
			escolha2 = JOptionPane.showInputDialog ("1 - Adicionar Contato\n2 - Remover Contato\n3 - Pesquisar Contato\n4 - Sair");
			esc2 = Integer.parseInt(escolha2);
			switch (esc2){
				case 1:
					try{
						agenda.adicionarContato(JOptionPane.showInputDialog ("Nome:"), JOptionPane.showInputDialog ("Telefone:"));
					}
					catch (ContatoExistenteException exc){
						JOptionPane.showMessageDialog (null,exc.getMessage());
						
					}
					break;
				case 2:
					try{
						agenda.removerContato(JOptionPane.showInputDialog("Contato a excluir:"));
					}
					catch (ContatoInexistenteException exc){
						JOptionPane.showMessageDialog (null,exc.getMessage());
					}
					break;
				case 3:
					try{
						Contato contato = agenda.pesquisarContato(JOptionPane.showInputDialog("Nome:"));
						JOptionPane.showMessageDialog(null,"Nome: " +contato.getNome()+ "\nTelefone: " + contato.getTelefone());
					}
					catch(ContatoInexistenteException exc){
						JOptionPane.showMessageDialog (null,exc.getMessage());
					}					
			}
		} while(esc2!=4);
		
		try{
			gravador.gravaContato(agenda.getContatos());
		}
		catch(IOException exc){
			JOptionPane.showMessageDialog (null,"Não foi possível salvar sua lista de contatos.");
		}
	}
}
