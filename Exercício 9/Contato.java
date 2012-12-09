import java.io.*;
public class Contato  implements  Serializable, Comparable<Contato>{
	private String nome, telefone;
	
	public Contato(){
		this("","");
	}
	
	public Contato(String n, String t){
		this.nome = n;
		this.telefone = t;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof Contato)){
			return false;
		}
		else{
			Contato contato = (Contato) obj;
			if(this.nome.equals(contato.getNome()) && (this.telefone == contato.getTelefone())){
				return true;
			}
			else{
				return false;
			}
		}
	}
	
	public String toString(){
		return("Nome: " + this.nome + "Telefone: "+ this.telefone);
	}
	
	public int compareTo(Contato contato){
		if(this.nome.compareTo(contato.getNome())<0 && this.telefone.compareTo(contato.getTelefone())<0){
			return -1;
		}
		else if(this.nome.compareTo(contato.getNome()) == 0 && (this.telefone.compareTo(contato.getTelefone())) == 0){
			return 0;
		}
		else{
			return 1;
		}
		}
}

