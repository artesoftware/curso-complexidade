package br.com.artesoftware.cursocomplexidade;

public class Sorveteria3Refatorada {
	
	public int precoSorvete(boolean premium, boolean casquinha, int coberturas) {
		int preco = 15 + 1 + 1; // copo + 1 cob;
		if (!premium) return preco;
		preco = 20 + 1 + 1;
		if (! casquinha) return preco;
		return (coberturas > 1)
				? preco + 2 : preco + 1;
	}


}
