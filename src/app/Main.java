package app;

import java.util.Scanner;

import javax.swing.JOptionPane;

import module.grid.Grid;
import module.grid.Grid3x3;
import module.grid.GridInterface;
import module.grid.ParserToGrid;

public class Main {

	private static Scanner scann;

	public static void main(String[] args) {

		scann = new Scanner(System.in);

		// Capturar os caracteres
		boolean cond = true;
		while (cond) {
			System.out.println("Insira uma sequencia de 9 caracteres");
			String input_elemments = scann.nextLine();

			// Verificar a quantidade
			if (input_elemments.length() == 9) {
				System.out.println("Tudo certo! Aguarde um momento em quanto convertemos a string");

				String[][] elemments = ParserToGrid.parse(input_elemments, 3);

				// Pedir os commandos ao usuários
				String commands_input;
				System.out.println("Insira os comando separados por ;");
				commands_input = scann.nextLine();

				String[] commands = commands_input.split(";");

				/*
				 * Criar mecanismo para identificar commandos e rotrnar uma
				 * string baseada na grid criada.
				 */
				Grid grid = new Grid3x3();
				grid.elements = elemments;
				
				String password = "";
				for (int i = 0; i < commands.length; i++) {

					switch (commands[i]) {
					case "c1":

						password += grid.getLine(1, 1);

						break;

					case "c2":
						password += grid.getCollumn(2, 1);
						break;

					case "c3":
						password += grid.getCollumn(3, 1);
						break;

					case "r1":
						password += grid.getCollumn(1, 1);
						break;

					case "r2":
						password += grid.getLine(2, 1);
						break;

					case "r3":
						password += grid.getLine(3, 1);
						break;

					case "dp":
						password += grid.getDiagonal(1, 1);
						break;

					case "ds":
						password += grid.getDiagonal(2, 1);
						break;

					}
				}
				System.out.println("Chave: " + input_elemments);
				System.out.println("Senha resultante: " + password);
				System.out.print("Fim do Programa");
				cond = false; // Saida do loop

			} else {
				System.out.println("Ops! Por favor, insira exatamente 9 caracteres.");
			}
			
		}
		
		

	}

}
