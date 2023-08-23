package _5_ElementoPosizioneX;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


class SequenzaInteriTest {
	
	@Test
	void testVerificaPosizioneSequenzaNulla() {
		int[] seq = null;
		SequenzaInteri test = new SequenzaInteri();
		assertTrue(test.verificaPosizione(seq));
	}
	
	@Test
	void testVerificaPosizioneSequenzaSingletonTrue() {
		int[] seq = {0};
		SequenzaInteri test = new SequenzaInteri();
		assertTrue(test.verificaPosizione(seq));
	}
	
	@Test
	void testVerificaPosizioneSequenzaSingletonFalse() {
		int[] seq = {3};
		SequenzaInteri test = new SequenzaInteri();
		assertFalse(test.verificaPosizione(seq));
	}
	
	@Test
	void testVerificaPosizioneSequenzaGenericaTrue() {
		int[] seq = {0, 1, 2};
		SequenzaInteri test = new SequenzaInteri();
		assertTrue(test.verificaPosizione(seq));
	}
	
	@Test
	void testVerificaPosizioneSequenzaGenericaFalsePrimoElemento() {
		int[] seq = {3, 1, 2};
		SequenzaInteri test = new SequenzaInteri();
		assertFalse(test.verificaPosizione(seq));
	}
	
	@Test
	void testVerificaPosizioneSequenzaGenericaFalseSecondoElemento() {
		int[] seq = {0, 4, 2};
		SequenzaInteri test = new SequenzaInteri();
		assertFalse(test.verificaPosizione(seq));
	}
	
	@Test
	void testVerificaPosizioneSequenzaGenericaFalseTerzoElemento() {
		int[] seq = {0, 1, 0};
		SequenzaInteri test = new SequenzaInteri();
		assertFalse(test.verificaPosizione(seq));
	}
	

}
