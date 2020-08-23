package br.com.artesoftware.cursocomplexidade;

public class BissextoInLine {

	public boolean isBissexto(int ano) {
		return ano % 400 == 0 || (ano % 4 ==0 && ano % 100 != 0) ;
	}

}
