import java.util.*;
import java.io.*;

public class GravadorDePedidos {

	public List<Pedido> lePedidos() throws IOException{
		ObjectInputStream leitor = null;
		try{
			leitor = new ObjectInputStream(new FileInputStream ("pedidos.txt"));
			return (List<Pedido>)leitor.readObject();
		}
		catch(FileNotFoundException exc){
			throw new IOException ("Arquivo .txt não encontrado", exc);
		}
		catch(IOException exc){
			throw exc;
		}
		catch (ClassNotFoundException exc){
			throw new IOException ("Classe não encontrada");
		}
		finally{
			if (leitor!=null){
				leitor.close();
			}
		}
	}
	
	public void gravaPedidos(List<Pedido> pedidos) throws IOException{
		ObjectOutputStream aux = null;
		try{
			aux = new ObjectOutputStream(new FileOutputStream ("pedidos.txt"));
			aux.writeObject(pedidos);
		}
		catch(FileNotFoundException exc){
			throw new IOException ("Arquivo .txt não encontrado");
		}
		catch(IOException exc){
			System.err.println("IO EXCEPTION");
			throw exc;
		}
		finally{
			if(aux!=null){
				aux.close();
			}
		}
	}
}