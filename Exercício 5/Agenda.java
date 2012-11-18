package br.ufpb.exercicio5;
import java.util.*;

public class Agenda implements AgendaIF{
	
	private List<Contato> contatos;
	
	public Agenda(){
		this.contatos = new ArrayList<Contato>();
	}
	
	public void adicionarContato(String nome, String tel){
		this.contatos.add(new Contato(nome,tel));
	}
	
	public void removerContato(String nomeContato) throws ContatoInexistenteException{
		for (Contato aux : this.contatos ){
			if(aux.getNome().equals(nomeContato)){
				this.contatos.remove(aux);
				break;
			}
		}
		throw new ContatoInexistenteException ("Contato não encontrado.");	
	}
	
	public Contato pesquisarContato(String nomeContato) throws ContatoInexistenteException{
		for (Contato aux : this.contatos ){
			if(aux.getNome().equals(nomeContato)){
				return aux;
			}
		}
		throw new ContatoInexistenteException ("Contato não encontrado.");
	}
}
		