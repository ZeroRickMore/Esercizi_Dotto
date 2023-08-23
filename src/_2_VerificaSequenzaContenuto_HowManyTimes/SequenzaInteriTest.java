package _2_VerificaSequenzaContenuto_HowManyTimes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SequenzaInteriTest {

	@Test
	void testVerificaContenutoTrovatoNull() {
		SequenzaInteri test = new SequenzaInteri(null);
		assertFalse(test.VerificaContenuto(3));
	}
	
	@Test
	void testVerificaContenutoTrovatoSingleton() {
		int[] seq = {3};
		SequenzaInteri test = new SequenzaInteri(seq);
		assertTrue(test.VerificaContenuto(3));
	}
	
	@Test
	void testVerificaContenutoTrovato() {
		int[] seq = {1, 3, 5, 4, 3};
		SequenzaInteri test = new SequenzaInteri(seq);
		assertTrue(test.VerificaContenuto(3));
	}
	
	
	@Test
	void testVerificaContenutoNonTrovatoSingleton() {
		int[] seq = {1};
		SequenzaInteri test = new SequenzaInteri(seq);
		assertFalse(test.VerificaContenuto(3));
	}
	
	@Test
	void testVerificaContenutoNonTrovato() {
		int[] seq = {1, 3, 5, 4, 3};
		SequenzaInteri test = new SequenzaInteri(seq);
		assertFalse(test.VerificaContenuto(47));
	}

	
	@Test
	void testContaQuanteVolteContenutoNull() {
		SequenzaInteri test = new SequenzaInteri(null);
		assertEquals(0, test.ContaQuanteVolteContenuto(3));
	}
	
	@Test
	void testContaQuanteVolteContenutoSingleton() {
		int[] seq = {3};
		SequenzaInteri test = new SequenzaInteri(seq);
		assertEquals(1, test.ContaQuanteVolteContenuto(3));
		assertEquals(0, test.ContaQuanteVolteContenuto(5));
	}
	
	@Test
	void testContaQuanteVolteContenutoCorretto() {
		int[] seq = {1, 3, 5, 4, 3};
		SequenzaInteri test = new SequenzaInteri(seq);
		assertEquals(2, test.ContaQuanteVolteContenuto(3));
	}

}
