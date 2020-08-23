package br.com.artesoftware.cursocomplexidade;

public class BissextoComum {

	// versões antigas do Sonar calculavam complexidade ciclomática = 6 por causa dos "returns" dentro dos "IFs"
	// a versão atual (8) calcula complexidade ciclomática = 4 porque ignoram estes "returns"

	public boolean isBissexto(int ano){ // +1
		if (ano % 400 == 0) { // +1
			return true; // +1 (Sonar antigo)
		}
		if (ano % 4 == 0 && ano % 100 != 0) { // + 2
			return true; // +1 (Sonar antigo)
		}
		return false; // não conta
	}
}
