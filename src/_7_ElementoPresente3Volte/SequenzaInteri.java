// Completare il corpo del metodo verificaTreOccorrenze(int[] seq, int x) che, dati una sequenza e un intero x, 
// controlla se l'intero x e' presente esattamente 3 volte nella sequenza seq.
// {1,1,1} restituisce true su 1, {1,1,1,1} restituisce false su 1.

package _7_ElementoPresente3Volte;

class SequenzaInteri {

	//	public boolean verificaTreOccorrenze(int[] seq, int x) {
	//		//COMPLETARE QUESTO METODO
	//		return false;
	//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	//Codice completo per testing -------------------------------

	public boolean verificaTreOccorrenze(int[] seq, int x) {
		if(seq!=null) {
			int cont = 0;
			for(int i=0; i<seq.length; i++) {
				if(seq[i]==x) {
					cont++;
				}
			}
			if(cont==3) {
				return true;
			}
		}
		return false;	
	}
}