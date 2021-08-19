package recursividade.controller;

public class RecursividadeController {
	public RecursividadeController() {
		super();
	}
	
	public int recursividade(int numero) {
		if(numero == 1) {
			return numero;
		}else {
			/*exemplo de 5
			 * 5 * metodo(4)
			 * 4 * metodo(3)
			 * 3 * metodo(2)
			 * 2 * metodo(1)
			 * 1, ele entra no if e retorna 1
			 * vai multiplicar cada um e returnoar o 120
			 */
			return numero * recursividade(numero-1);
		}
	}
	
}
