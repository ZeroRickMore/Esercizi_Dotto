package _6_ElementoPosizioneX;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


class SequenzaInteriTest {
	
	@Test
	void testVerificaSommaPrecedentiSequenzaNulla() {
		int[] seq = null;
		SequenzaInteri test = new SequenzaInteri();
		assertFalse(test.verificaSommaPrecedenti(seq, 2));
	}
	
	@Test
	void testVerificaSommaPrecedentiPosizioneTroppoGrande() {
		int[] seq = {2, 3, 5};
		SequenzaInteri test = new SequenzaInteri();
		assertFalse(test.verificaSommaPrecedenti(seq, 4));
	}
	
	@Test
	void testVerificaSommaPrecedentiSingletonTrue() {
		int[] seq = {0};
		SequenzaInteri test = new SequenzaInteri();
		assertTrue(test.verificaSommaPrecedenti(seq, 0));
	}
	
	@Test
	void testVerificaSommaPrecedentiSequenzaSingletonFalse() {
		int[] seq = {3};
		SequenzaInteri test = new SequenzaInteri();
		assertFalse(test.verificaSommaPrecedenti(seq, 0));
	}
	
	@Test
	void testVerificaSommaPrecedentiSequenzaGenericaTrue() {
		int[] seq = {0, 1, 2, 9, 12};
		SequenzaInteri test = new SequenzaInteri();
		assertTrue(test.verificaSommaPrecedenti(seq, 4));
	}
	
	@Test
	void testVerificaSommaPrecedentiSequenzaGenericaFalse() {
		int[] seq = {3, 148, 1};
		SequenzaInteri test = new SequenzaInteri();
		assertFalse(test.verificaSommaPrecedenti(seq, 2));
	}

}
