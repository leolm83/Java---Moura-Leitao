package jantando;

import java.text.DecimalFormat;

public class Pessoa {
	private String nome;
	private double peso;
	static final DecimalFormat duasCasas = new DecimalFormat("0.00");  
	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	Pessoa(String nome,double peso){
		this.nome=nome;
		this.peso=peso;
	}
	public void comer(Comida c) {
		System.out.println(this.getNome()+" Está comendo : "+c.getNome());
		this.peso+=c.getPeso();
	}
	
	@Override
	public String toString(){
		return "Nome : "+this.getNome()+" Peso Atual :"+duasCasas.format(this.getPeso());
	}
}
