package app;

import javax.swing.JOptionPane;

import module.grid.FactoryGrid;
import module.grid.Grid;
import module.grid.ParserToGrid;
import module.grid.ParserToPassword3x3;
import module.grid.ParserToPassword4x4;

public class Main {

	public static void main(String[] args) {
		
		String mensagem_entrada = "Gerador de Senha Baseado em Grid \n1 - Senha base 3x3 \n2 - Senha base 4x4 \n3 - Informações \n4 - Sair";
		String mensagem_saida = "Obrigado pela preferência";
		String info = "c[n] = colunas \nr[n] = linhas \ndp = diagonal principal (esquerda para direita) \nds = diagonal secundária (direita para esquerda)";
		
		boolean cond = true;
		String opc = "";
		while(cond){
			
			opc = JOptionPane.showInputDialog(mensagem_entrada);
			
			try{
				if(opc.equals("4")){
					JOptionPane.showMessageDialog(null, mensagem_saida);
					cond = false;
				}
				
				else if(opc.equals("1")){
					
					String input_key = JOptionPane.showInputDialog("Insira uma sequencia de 9 caracters");

					
					if (input_key.length() == 9) {

						String[][] key = ParserToGrid.parse(input_key, 3);
						Grid grid = FactoryGrid.create(3);
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
				 
				else if (opc.equals("2")){
					String input_key = JOptionPane.showInputDialog("Insira uma sequencia de 16 caracters");

					
					if (input_key.length() == 16) {

						String[][] key = ParserToGrid.parse(input_key, 4);
						Grid grid = FactoryGrid.create(4);;
						grid.elements = key;
						
						// Pedir os commandos ao usuários
						String commands_input = JOptionPane.showInputDialog("Insira os comando separados por ;");
						String password = ParserToPassword4x4.parse(commands_input, grid);
						
						JOptionPane.showMessageDialog(null, "Chave:\n " + input_key + "\n" + "\nSenha resultante:\n " + password);
						
						cond = false; // Saida do loop

					} else {
						JOptionPane.showMessageDialog(null, "Ops! Estamos trabalhando com uma grid 4x4, logo precisamos de 16 caracteres.\n Por favor, insira exatamente 16 caracteres.");
					}
				}
				
				else if (opc.equals("3")){
					
					JOptionPane.showMessageDialog(null, info);
					
				}
				
				else{
					JOptionPane.showMessageDialog(null, "Opçao inválida");
				}
				
				
			}
			
			catch (NullPointerException e){
				JOptionPane.showMessageDialog(null, "Por favor insira o numero 4 para fechar.");
				
			}
		}
	}

}
