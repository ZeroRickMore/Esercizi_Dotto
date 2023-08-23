package _4_InversioneArray;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SequenzaInteriTest {
	
	private SequenzaInteri test;
	
	@BeforeEach
	void setUp() {
		this.test =  new SequenzaInteri();
	}
	
	
	@Test
	void testInvertiSequenzaNull() {
		int[] seq = null;
		assertNull(this.test.invertiSequenza(seq));
	}
	
	@Test
	void testInvertiSequenzaSingleton() {
		int[] seq = {1};
		assertTrue(Arrays.equals(seq, this.test.invertiSequenza(seq)));
	}
	
	@Test
	void testInvertiSequenza() {
		int[] seq = {1, 2, 3, 4, 5};
		int[] inv = {5, 4, 3, 2, 1};
		assertTrue(Arrays.equals(inv, this.test.invertiSequenza(seq)));
	}
	
	@Test
	void testInvertiSequenzaPalidroma() {
		int[] seq = {1, 2, 3, 2, 1};
		assertTrue(Arrays.equals(seq, this.test.invertiSequenza(seq)));
	}
	
	@Test
	void testInvertiSequenzaTuttaUguale() {
		int[] seq = {1, 1, 1};
		assertTrue(Arrays.equals(seq, this.test.invertiSequenza(seq)));
	}

}
