package br.ufpb.exercicio5;

public class ProgramaExercicio5 {

	public static void main(String[] args) {
	
		Agenda agenda = new Agenda();
		agenda.adicionarContato("Danilo","8888888");

		try{
			agenda.pesquisarContato("Danilo");
		}
		catch(ContatoInexistenteException exc){
			System.err.println("Contato não cadastrado.");
		}
		try{
			agenda.pesquisarContato("Ayla");
		}
		catch(ContatoInexistenteException exc){
			System.err.println("Contato não cadastrado.");
		}
	}
}
