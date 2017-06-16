package module.grid;

import module.string.EmoticonsEncode;
import module.string.Encode;

public class ParserToPassword6x6 extends ParserToPassword {
	
	public String parse(String commands_input, Grid grid) {
		String[] commands = commands_input.split(";");
		
		String password = "";
		for (int i = 0; i < commands.length; i++) {

			switch (commands[i]) {
			case "c1":

				password += grid.getCollumn(1, 1);

				break;

			case "c2":
				password += grid.getCollumn(2, 1);
				break;

			case "c3":
				password += grid.getCollumn(3, 1);
				break;
			
			case "c4":
				password += grid.getCollumn(4, 1);
				break;
				
			case "c5":
				password += grid.getCollumn(5, 1);
				break;
				
			case "c6":
				password += grid.getCollumn(6, 1);
				break;
				
				

			case "r1":
				password += grid.getLine(1, 1);
				break;

			case "r2":
				password += grid.getLine(2, 1);
				break;

			case "r3":
				password += grid.getLine(3, 1);
				break;
				
			case "r4":
				password += grid.getLine(4, 1);
				break;

			case "r5":
				password += grid.getLine(5, 1);
				break;
				
			case "r6":
				password += grid.getLine(6, 1);
				break;
				
				
				
			case "dp":
				password += grid.getDiagonal(1, 1);
				break;

			case "ds":
				password += grid.getDiagonal(2, 1);
				break;
			
			case "emoticon":
				Encode emotion_encoder = new EmoticonsEncode();
				password = emotion_encoder.encode(password);
				
			}
		}
		return password;
	}

}
