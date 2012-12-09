import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class TestaAgendaMap {
	
				
		@Test
		public void AgendaMapTest() {
			AgendaMap agenda = new AgendaMap();
		
			try{
				agenda.adicionarContato("Danilo", "111");
			}catch (ContatoExistenteException exc){
				fail("O contato Danilo não foi adicinado.");
			}
		
			try{
				assertEquals(agenda.pesquisarContato("Danilo").getNome(), "Danilo");
			} catch  (ContatoInexistenteException exc){
				fail("O contato Danilo não foi encontrado.");
			}
		
			
			try{
				agenda.removerContato("Danilo");
			} catch (ContatoInexistenteException excecao1){
				fail("O contato Danilo não foi encontrado para ser removido.");
			
			}
			
			try{
				assertEquals(agenda.pesquisarContato("Danilo").getNome(), "Danilo");
				fail("Removeu um contato que não existe.");
			} catch  (ContatoInexistenteException excecao){
					
			}
			
			try{
				agenda.adicionarContato("Danilo", "1111");
				agenda.adicionarContato("Ayla", "2222");
			} catch (ContatoExistenteException excecao){
				fail("Erro ao adicionar os contatos Ayla e Danilo");
			}
			
			Iterator <Contato> contOrdenados = agenda.getContatosOrdenados();
			assertTrue(contOrdenados.hasNext());
			
			
			Contato cont1 = contOrdenados.next();
			assertEquals("Ayla", cont1.getNome());
				
			assertTrue(contOrdenados.hasNext());
			Contato cont2 = contOrdenados.next();
			assertEquals("Danilo", cont2.getNome());
		}
}
