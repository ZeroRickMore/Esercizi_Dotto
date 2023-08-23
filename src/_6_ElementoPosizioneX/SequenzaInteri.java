// Scrivere il codice del metodo verificaSommaPrecedenti(int[] seq, int pos) che, dati un array di interi e un intero pos, 
// che rappresenta un indice di un elemento nell'array, 
// verifica che la somma di tutti gli elementi dell'array precedenti all'elemento in posizione pos (lui escluso) sia uguale all'elemento in posizione pos. 
// Per esempio, nella sequenza {7, 2, 9} con pos = 2, il metodo restituisce true, perche' 9 (in posizione 2) è = 7+2. 
// Invece nella sequenza {1, 4, 2, 3}, con pos = 2 il metodo restituisce false, perche' 2 e' diverso da 1+4, i suoi precedenti nell'array.


package _6_ElementoPosizioneX;

class SequenzaInteri {

//	public boolean verificaSommaPrecedenti(int[] seq, int x) {
//		//COMPLETARE QUESTO METODO
//		return false;
//	}
	
	
	
	
	
	
	
	
	
	
	
	//Codice completo per testing -------------------------------
	
	public boolean verificaSommaPrecedenti(int[] seq, int pos) {
		int cont = 0;
		if(seq!=null && pos<seq.length) {
			for(int i=0; i<pos; i++) {
				cont += seq[i];
			}
			if(seq[pos] == cont) {
				return true;
			}
			return false;
		}
		return false;
	}
	
}
