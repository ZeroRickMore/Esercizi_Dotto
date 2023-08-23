package _3_VerificaSequenza_RestituisciIndice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SequenzaInteriTest {
	
	@Test
	void testValore2indiceSequenzaNulla() {
		int[] seq2 = null;
		SequenzaInteri test2 = new SequenzaInteri(seq2);
		assertEquals(-1, test2.valore2indice(3), "Attenzione alla sequenza nulla, in cui l'elemento NON si trova");
	}

	@Test
	void testValore2indiceTrovatoSingleton() {
		int[] seq = {1};
		SequenzaInteri test = new SequenzaInteri(seq);
		assertEquals(0, test.valore2indice(1));
	}
	
	@Test
	void testValore2indiceTrovato() {
		int[] seq = {1, 3, 4, 5};
		SequenzaInteri test = new SequenzaInteri(seq);
		assertEquals(0, test.valore2indice(1));
		assertEquals(1, test.valore2indice(3));
		assertEquals(2, test.valore2indice(4));
		assertEquals(3, test.valore2indice(5));
	}
	
	@Test
	void testValore2indiceNonTrovatoSingleton() {
		int[] seq = {1};
		SequenzaInteri test = new SequenzaInteri(seq);
		assertEquals(-1, test.valore2indice(2), "Potrebbe aiutare: Se il valore non si trova nella sequenza, la funzione deve restituire -1");
		assertEquals(-1, test.valore2indice(0), "Potrebbe aiutare: Se il valore non si trova nella sequenza, la funzione deve restituire -1");
	}

	@Test
	void testValore2indiceNonTrovato() {
		int[] seq = {1, 3, 4, 5};
		SequenzaInteri test = new SequenzaInteri(seq);
		assertEquals(-1, test.valore2indice(2), "Potrebbe aiutare: Se il valore non si trova nella sequenza, la funzione deve restituire -1");
		assertEquals(-1, test.valore2indice(0), "Potrebbe aiutare: Se il valore non si trova nella sequenza, la funzione deve restituire -1");
	}


	@Test
	void testValore2indiceTrovatoTroppeVolte() {
		//Consecutivi e non consecutivi
		int[] seq = {1, 3, 4, 4, 3};
		SequenzaInteri test = new SequenzaInteri(seq);
		assertEquals(-2, test.valore2indice(3), "Potrebbe aiutare: Se il valore si trova piu' di una volta nella sequenza, la funzione deve restituire -2");
		assertEquals(-2, test.valore2indice(4), "Potrebbe aiutare: Se il valore si trova piu' di una volta nella sequenza, la funzione deve restituire -2");
		//Non consecutivi
		int[] seq2 = {0, 1, 3, 4, 3, 0};
		SequenzaInteri test2 = new SequenzaInteri(seq2);
		assertEquals(-2, test2.valore2indice(0), "Potrebbe aiutare: Se il valore si trova piu' di una volta nella sequenza, la funzione deve restituire -2");
		assertEquals(-2, test2.valore2indice(3), "Potrebbe aiutare: Se il valore si trova piu' di una volta nella sequenza, la funzione deve restituire -2");
		//Tutto uguale consecutivi
		int[] seq3 = {1, 1, 1};
		SequenzaInteri test3 = new SequenzaInteri(seq3);
		assertEquals(-2, test3.valore2indice(1), "Potrebbe aiutare: Se il valore si trova piu' di una volta nella sequenza, la funzione deve restituire -2");
	}

	
}



