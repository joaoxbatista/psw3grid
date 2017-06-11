package module.grid;

public class ParserToGrid {

	public static String[][] parse(String input_elemments, int dimension){
		
		int row = 0;
		int collumn = 0;
		String elemments[][] = new String[dimension][dimension];
		
		for(int i = 0; i < input_elemments.length(); i++){
			
			elemments[row][collumn] = Character.toString(input_elemments.charAt(i));
			collumn++;
			if((i+1)%3 == 0){
				row++;
				collumn = 0;
			}
			
		}
		return elemments;
	}
}
