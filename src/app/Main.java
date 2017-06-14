package app;

import java.util.Scanner;

import javax.swing.JOptionPane;
import module.grid.Grid;
import module.grid.Grid3x3;
import module.grid.ParserToGrid;
import module.grid.ParserToPassword3x3;

public class Main {

	private static Scanner scann;

	public static void main(String[] args) {
		
		/*Execução de exemplo para a Grid 3x3*/
		boolean cond = true;
		while (cond) {
			
			String input_key = JOptionPane.showInputDialog("Insira uma sequencia de 9 caracters");
			
			if (input_key.length() == 9) {

				String[][] key = ParserToGrid.parse(input_key, 3);
				Grid grid = new Grid3x3();
				grid.elements = key;
				
				// Pedir os commandos ao usuários
				String commands_input = JOptionPane.showInputDialog("Insira os comando separados por ;");
				String password = ParserToPassword3x3.parse(commands_input, grid);
				
				JOptionPane.showMessageDialog(null, "Chave:\n " + input_key + "\n" + "\nSenha resultante:\n " + password);
				
				cond = false; // Saida do loop

			} else {
				JOptionPane.showMessageDialog(null, "Ops! Estamos trabalhando com uma grid 3x3, logo precisamos de 9 caracteres.\n Por favor, insira exatamente 9 caracteres.");
			}
			
		}
		
	}

}
