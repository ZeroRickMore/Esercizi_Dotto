package _4_InversioneArray;
/*
 * Scrivere il corpo del metodo invertiSequenza(int[] seq) che, data una sequenza di interi in input, restituisce una sequenza invertita
 * 
 * */
class SequenzaInteri {
	
//	public int[] invertiSequenza(int[] seq) {
//		//COMPLETARE QUESTO METODO
//		
//		return null;
//	}







	//Codice completo per testing -------------------------------



	public int[] invertiSequenza(int[] seq) {

		if(seq == null) return seq;

		int length = seq.length;
		int[] seqInv = new int[length];

		for(int i = 0; i<length; i++) {
			seqInv[length - 1 - i] = seq[i];
		}
		return seqInv;
	}

}
