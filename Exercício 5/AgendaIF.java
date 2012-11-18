package br.ufpb.exercicio5;
/**
 * Esta interface deve ser utilizada na cria��o de agendas telef�nicas.
 * 
 * @author Danilo
 *
 */
public interface AgendaIF {
	
	/**
	 * Adiciona um objeto do tipo Contato.
	 * 
	 * @param nome Recebe o nome do contato a ser adicionado.
	 * @param tel Recebe o n�mero de telefone do contato a ser adicionado.
	 */

	public void adicionarContato(String nome, String tel); 
	
	/**
	 * Remove um objeto do tipo Contato.
	 * 
	 * @param nomeContato Recebe o nome do contato a ser removido.
	 * @throws ContatoInexistenteException Lan�a a exce��o ContatoInexistenteException caso n�o encontre o contato a ser removido.
	 */
	
	public void removerContato(String nomeContato) throws ContatoInexistenteException;
	
	/**
	 * Pesquisa um contato atrav�s do nome fornecido.
	 * 
	 * @param nomeContato Recebe o nome do contato a ser pesquisado.
	 * @return Retorna o contato encontrado.
	 * @throws ContatoInexistenteException Lan�a a exce��o ContatoInexistenteException caso n�o encontre o contato pesquisado.
	 */
	public Contato pesquisarContato(String nomeContato) throws ContatoInexistenteException;
}
