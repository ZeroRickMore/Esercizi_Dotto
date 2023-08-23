// Scrivere il codice del metodo verificaPosizione(int[] seq), che verifica che in una sequenza di interi ogni elemento sia uguale alla sua posizione nell'array.

package _5_ElementoPosizioneX;

class SequenzaInteri {	

//	public boolean verificaPosizione(int[] seq) {
//		//COMPLETARE QUESTO METODO
//		return false;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	//Codice completo per testing -------------------------------
	
	public boolean verificaPosizione(int[] seq) {
		if(seq!=null) {
			for(int i=0; i<seq.length; i++) {
				if(seq[i] != i) {
					return false;
				}
			}
		}
		return true;
	}
	
	
}
