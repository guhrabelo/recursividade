package recursividade.view;

import recursividade.controller.RecursividadeController;

public class Main {
	public static void main(String[] args) {
		RecursividadeController rec = new RecursividadeController();
		
		int fat = 5;
		
		fat = rec.recursividade(fat);
		System.out.println(fat);
	}
}
