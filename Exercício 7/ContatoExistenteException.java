public class ContatoExistenteException extends Exception {
	
		public ContatoExistenteException(){
			this("O Contato J� Existete.");
		}
		public ContatoExistenteException(String m){
			super (m);
		}
}
