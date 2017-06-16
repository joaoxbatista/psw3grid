package app;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import module.grid.FactoryGrid;
import module.grid.FactoryParserToPassword;
import module.grid.Grid;
import module.grid.ParserToGrid;
import module.grid.ParserToPassword;

public class FacadeGrid {
	
	/*Mensagens utilizados no menu e nos alertas*/
	static String mensagem_entrada = "Gerador de Senha Baseado em Grid \n1 - Senha base 3x3 \n2 - Senha base 4x4 \n3 - Senha base 6x6 \n4 - Informações \n5 - Sair";
	static String mensagem_saida = "Obrigado pela preferência";
	static String info = "c[n] = colunas \nr[n] = linhas \ndp = diagonal principal (esquerda para direita) \nds = diagonal secundária (direita para esquerda) \nemoticon = substitui vogais por emoticons \nnumbers = substitui alguns números por outros ";
	
	
	/*Método que executa o fluxo principal da aplicação*/
	public static void execute() {
		
		boolean cond = true;
		String opc = "";
		
		while (cond) {
			opc = JOptionPane.showInputDialog(mensagem_entrada);
			cond = commands(opc);
		}
	}
	
	/*Função para o processo de gerar senha*/
	public static void generate(int dimension){
		
		int result_dimension = dimension*dimension;
		String input_key = JOptionPane.showInputDialog("Insira uma sequencia de "+result_dimension+" caracters");

		if (input_key.length() == result_dimension) {

			String[][] key = ParserToGrid.parse(input_key, dimension);
			Grid grid = FactoryGrid.create(dimension);
			grid.elements = key;

			// Pedir os commandos ao usuário
			String commands_input = JOptionPane.showInputDialog("Insira os comando separados por ;");
			ParserToPassword parser;
			parser = FactoryParserToPassword.create(dimension);
			String password = parser.parse(commands_input, grid);
			
			
			// Criação de um textarea para exibir as informações
						JTextArea ta = new JTextArea(10, 10);
			            ta.setText("Chave:\n " + input_key + "\n\n" +"Comandos: \n"+commands_input+ "\n\nSenha resultante:\n " + password);
			            ta.setWrapStyleWord(true);
			            ta.setLineWrap(true);
			            ta.setCaretPosition(0);
			            ta.setEditable(false);

			            
			            JOptionPane.showMessageDialog(null, new JScrollPane(ta), "PSW3GRID - Senha Gerada", JOptionPane.INFORMATION_MESSAGE);

		} else {
			JOptionPane.showMessageDialog(null,
					"Ops! Estamos trabalhando com uma grid "+dimension+"x"+dimension+", logo precisamos de "+result_dimension+" caracteres.", "qtd_erri", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	/*Métotodo que retona o menu com sua estrutura de decisão*/
	public static boolean commands(String opc){
		boolean cond = true;
		
		try {
			
			if (opc.equals("5")) {
				JOptionPane.showMessageDialog(null, mensagem_saida);
				cond = false;
			}

			else if (opc.equals("1")) {
				generate(3);

			}

			else if (opc.equals("2")) {
				generate(4);
			}

			else if (opc.equals("3")) {

				generate(6);

			}
			
			else if (opc.equals("4")) {

				JOptionPane.showMessageDialog(null, info);

			}

			else {
				JOptionPane.showMessageDialog(null, "Opção inválida", "comando inválido", JOptionPane.WARNING_MESSAGE);
			}

		}

		catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Por favor insira o numero 5 para fechar da próxima vez");
			cond = false;

		}
		
		return cond;
	}
}
