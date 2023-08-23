package _3_VerificaSequenza_RestituisciIndice;
/*
 * Completare il corpo del metodo valore2indice(int x) che, dato un intero x in input, lo cerca nella sequenza, e restituisce, 
 * se c’e', l’indice in cui si trova. Se l'elemento fosse presente piu' di una volta, restituisce -2.
 * Se non fosse nella sequenza, restituisce -1.
 */

class SequenzaInteri {

	private int[] seq;

	public SequenzaInteri(int[] seq) {
		this.seq = seq;
	}

//	//CAMBIARE IL CODICE DA QUI IN POI
//
//	public int valore2indice(int x) {
//		//COMPLETARE QUESTO METODO
//
//
//		return 0;
//	}




	//Codice completo per testing -------------------------------


	public int valore2indice(int x) {
		int index = -1;
		int cont = 0;
		if(seq!=null) {
			for(int i = 0; i < seq.length; i++) {
				if(seq[i] == x) {
					cont ++;
					if(cont == 2) return -2;
					index = i;
				}
			}
		}
		return index;
	}
}