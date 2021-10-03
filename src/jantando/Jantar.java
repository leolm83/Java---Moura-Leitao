package jantando;

public class Jantar {
	public static void main(String[] args) {
		Pessoa leonardo = new Pessoa("Leonardo",68.9);
		Comida macarrao = new Comida("Macarrao",0.200);
		Comida feijoada = new Comida("Feijoada",0.350);
		System.out.println(leonardo.toString());
		leonardo.comer(macarrao);
		System.out.println(leonardo.toString());
		leonardo.comer(feijoada);
		System.out.println(leonardo.toString());
	}
}
