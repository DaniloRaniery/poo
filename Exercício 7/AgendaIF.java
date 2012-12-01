/**
 * Esta interface deve ser utilizada na criação de agendas telefônicas.
 * 
 * @author Danilo
 *
 */
import java.util.*;

public interface AgendaIF {
	
	/**
	 * Adiciona um objeto do tipo Contato.
	 * 
	 * @param nome Recebe o nome do contato a ser adicionado.
	 * @param tel Recebe o número de telefone do contato a ser adicionado.
	 */

	public void adicionarContato(String nome, String tel)throws ContatoExistenteException; 
	
	/**
	 * Remove um objeto do tipo Contato.
	 * 
	 * @param nomeContato Recebe o nome do contato a ser removido.
	 * @throws ContatoInexistenteException Lança a exceção ContatoInexistenteException caso não encontre o contato a ser removido.
	 */
	
	public void removerContato(String nomeContato) throws ContatoInexistenteException;
	
	/**
	 * Pesquisa um contato através do nome fornecido.
	 * 
	 * @param nomeContato R
	 * ecebe o nome do contato a ser pesquisado.
	 * @return Retorna o contato encontrado.
	 * @throws ContatoInexistenteException Lança a exceção ContatoInexistenteException caso não encontre o contato pesquisado.
	 */
	public Contato pesquisarContato(String nomeContato) throws ContatoInexistenteException;
	
	/**
	 * Retorna todos os contatos através de uma Lista.
	 */
	public Collection<Contato> getContatos();
}
