
public class ObjProb7 {
	
	int indice = 0;
	int tamaño = 0;
	
	public int[] ampliarArray(int[] arr, int factor) {
		
		int[] retorno = new int[arr.length + factor];
		
		for(int i=0; i<arr.length; i++) {
			
			retorno[i] = arr[i];
		}
		
		return retorno;
	}

}
