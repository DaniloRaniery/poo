import java.util.*;
import java.io.*;

public class GravadorDeContatos {
	
		public List<Contato> recuperaContato() throws IOException{
			ObjectInputStream aux = null;
			try{
				aux = new ObjectInputStream(new FileInputStream("contatos.txt"));
				return (ArrayList<Contato>)aux.readObject();
			}catch(FileNotFoundException exc){
				throw new IOException("Arquivo não encontrado",exc);
			}catch(ClassNotFoundException exc){
				throw new IOException("Classe não encontrada",exc);
			}catch(IOException exc){
				throw exc;
			}finally{
				if(aux != null){
					aux.close();
				}
			}
		}
		public void gravaContato(Collection<Contato> contatos)throws IOException{
			ObjectOutputStream aux = null;
			try{
				aux = new ObjectOutputStream(new FileOutputStream(new File("contatos.txt")));
				aux.writeObject(contatos);
				System.out.println("Fim do arquivo.");
			}catch(FileNotFoundException exc){
				throw new IOException("Arquivo não encontrado", exc);
			}catch(IOException exc){
				System.out.println();
				throw exc;
			}finally{
				if(aux != null){
					aux.close();
				}
			}
	}
}

