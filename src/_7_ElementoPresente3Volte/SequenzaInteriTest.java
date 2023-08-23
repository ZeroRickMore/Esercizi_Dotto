package _7_ElementoPresente3Volte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SequenzaInteriTest {
	
	@Test
	void testVerificaTreOccorrenzeSequenzaNulla() {
		int[] seq = null;
		SequenzaInteri test = new SequenzaInteri();
		assertFalse(test.verificaTreOccorrenze(seq, 5));
	}
	
	@Test
	void testVerificaTreOccorrenzeSingleton() {
		int[] seq = {1};
		SequenzaInteri test = new SequenzaInteri();
		assertFalse(test.verificaTreOccorrenze(seq, 1));
	}

	@Test
	void testVerificaTreOccorrenzeDoppietta() {
		int[] seq = {1, 1};
		SequenzaInteri test = new SequenzaInteri();
		assertFalse(test.verificaTreOccorrenze(seq, 1));
	}
	
	@Test
	void testVerificaTreOccorrenzeTripletta() {
		int[] seq = {1, 1, 1};
		SequenzaInteri test = new SequenzaInteri();
		assertTrue(test.verificaTreOccorrenze(seq, 1));
	}
	
	@Test
	void testVerificaTreOccorrenzeMoreThanThreeElements() {
		int[] seq = {1, 1, 1, 2, 3};
		SequenzaInteri test = new SequenzaInteri();
		assertTrue(test.verificaTreOccorrenze(seq, 1));
	}
	
	@Test
	void testVerificaTreOccorrenzeTroppeOccorrenze() {
		int[] seq = {1, 1, 1, 1, 3};
		SequenzaInteri test = new SequenzaInteri();
		assertFalse(test.verificaTreOccorrenze(seq, 1));
	}
	
}
