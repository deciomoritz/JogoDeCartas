package modelo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Baralho {
	
	@Id
	@GeneratedValue
	private int id;
	
	private int quantidade;
	
    @OneToMany(fetch = FetchType.EAGER, targetEntity = ExemplarDeCarta.class)
    @JoinColumn(name = "baralho_id")   
	private List<ExemplarDeCarta> listaDeExemplares;
	private String nome;
	
	public Baralho(){
	}
	
	public Baralho(String nome) {
		this.nome = nome;
		listaDeExemplares = new ArrayList<ExemplarDeCarta>();
	}
	
	public int getTamanho(){
		return listaDeExemplares.size();
	}
	
	public String getNomeCarta(int index) {
		return listaDeExemplares.get(index).getNome();
	}
	
	public ExemplarDeCarta getExemplar(int index) {
		return listaDeExemplares.get(index);
	}
	
	public int compararTamanho(int valor) {
		if(valor>quantidade)
			return 1;
		else if(valor<quantidade)
			return -1;
		return 0;
	}
	
	public ExemplarDeCarta comprar(){
		return listaDeExemplares.remove(0);
	}
	
	public void embaralhar(){
		Collections.shuffle(listaDeExemplares);
	}
	
	public int quantidadeDeExemplares(String nome) {
		int val =0;
		for(int i =0;i<quantidade;i++){
			if(getNomeCarta(i)==nome)
				val++;
		}
		return val;
	}
	
	public void remover(ExemplarDeCarta e) {
		if(listaDeExemplares.remove(e))
			quantidade--;
	}
	
	public void adicionar(ExemplarDeCarta e) {
		quantidade++;
		listaDeExemplares.add(e);
	}
	
	public String getNome() {
		return nome;
	}
	
	public int quantidade(){
		return quantidade;
	}

}
