package br.com.artesoftware.cursocomplexidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sorveteria3RefatoradaTest {

	@Test
	public void testAlgumasOpcoes() {
		Sorveteria3Refatorada sorveteria = new Sorveteria3Refatorada();
		assertEquals(17, sorveteria.precoSorvete(false, false, 1)); // Comum-Copinho-1Cob
		assertEquals(23, sorveteria.precoSorvete(true, true, 1)); // Premium-Copinho-1Cob
		assertEquals(22, sorveteria.precoSorvete(true, false, 1)); // Premium-Casquinha-1Cob
		assertEquals(24, sorveteria.precoSorvete(true, true, 2)); // Premium-Copinho-2Cob
	}

}
