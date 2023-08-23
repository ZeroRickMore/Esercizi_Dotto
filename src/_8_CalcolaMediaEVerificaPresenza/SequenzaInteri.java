package _8_CalcolaMediaEVerificaPresenza;

/*
 * Completare il corpo del metodo calcolaMediaEVerificaPresenza(int[] seq, int x), 
 * che data in input una sequenza verifica se la media dei suoi valori e' esso stesso uno dei valori.
 * As esempio, {2, 4, 6} ha media 4, e 4 e' contenuto nella sequenza, quindi la funziona restituisce true. 
 * Approssimare la media utilizzando int. 
 * */


class SequenzaInteri {

	//	public boolean calcolaMediaEVerificaPresenza(int[] seq, int x) {
	//		//COMPLETARE QUESTO METODO
	//		return false;
	//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Codice completo per testing -------------------------------

	public boolean calcolaMediaEVerificaPresenza(int[] seq) {
		
		if(seq==null) return false;
		
		int somma = 0;
		
		for(int i:seq) {
			somma += i;
		}
		
		int media = somma/seq.length;
		
		for(int i:seq)
			if(media==i) return true;
		
		return false;
	}

}
