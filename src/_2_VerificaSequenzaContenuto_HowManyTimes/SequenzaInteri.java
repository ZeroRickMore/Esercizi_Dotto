package _2_VerificaSequenzaContenuto_HowManyTimes;
/*
 * Completare il corpo del metodo VerificaContenuto(int x) affinche' verifichi se l'elemento x e' contenuto nella sequenza di istanza.
 * Completare il corpo del metodo ContaQuanteVolteContenuto(int x) affinche' conti quante volte l'elemento x e' contenuto nella sequenza di istanza.
 * */

class SequenzaInteri {

	private int[] seq;

	public SequenzaInteri(int[] seq) {
		this.seq = seq;
	}
	
//	//CAMBIARE IL CODICE DA QUI IN POI
//
//	public boolean VerificaContenuto(int x) {
//		//COMPLETARE QUESTO METODO
//		return false;
//
//	}
//
//	public int ContaQuanteVolteContenuto(int x) {
//		//COMPLETARE QUESTO METODO
//
//		return 0;
//	}


	
	
	
	
	//Codice completo per testing -------------------------------

	//Vedi se l’elemento x dato in input e' nell’array
	public boolean VerificaContenuto(int x) {

		if(seq==null)
			return false;
		for(int i: seq) {
			if(i == x) return true;
		}
		return false;
	}

	//Conta quante volte x e' presente nella seq
	public int ContaQuanteVolteContenuto(int x) {

		if (seq==null) return 0;
		int cont = 0;
		for(int i: seq) {
			if(i == x) cont++;
		}
		return cont;

	}

}
