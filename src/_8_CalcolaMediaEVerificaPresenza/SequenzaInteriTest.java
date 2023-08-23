package _8_CalcolaMediaEVerificaPresenza;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SequenzaInteriTest {

	private SequenzaInteri test;
	
	@BeforeEach
	void setUp() {
		this.test = new SequenzaInteri();
	}
	
	@Test
	void testCalcolaMediaEVerificaPresenzaNull() {
		assertFalse(test.calcolaMediaEVerificaPresenza(null));
	}

	@Test
	void testCalcolaMediaEVerificaPresenzaSingleton() {
		int[] seq = {1};
		assertTrue(test.calcolaMediaEVerificaPresenza(seq));
	}
	
	@Test
	void testCalcolaMediaEVerificaPresenzaDoppietta() {
		int[] seq = {1, 2};
		assertTrue(test.calcolaMediaEVerificaPresenza(seq));
		int[] seq2 = {1, 1};
		assertTrue(test.calcolaMediaEVerificaPresenza(seq2));
		int[] seq3 = {100, 2};
		assertFalse(test.calcolaMediaEVerificaPresenza(seq3));
	}
	
	@Test
	void testCalcolaMediaEVerificaPresenzaQualsiasiNumeroDiElementi() {
		int[] seq = {1, 2, 3, 100};
		assertFalse(test.calcolaMediaEVerificaPresenza(seq));
		int[] seq2 = {0, 2, 3, 5};
		assertTrue(test.calcolaMediaEVerificaPresenza(seq2));
		int[] seq3 = {1, 2, 3, 5};
		assertTrue(test.calcolaMediaEVerificaPresenza(seq3));
	}

}
