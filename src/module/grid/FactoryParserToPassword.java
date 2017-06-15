package module.grid;

public class FactoryParserToPassword {

	public static ParserToPassword create(int dimension){
		ParserToPassword parser;
		switch(dimension){
			
			case 3:
				parser = new ParserToPassword3x3();
				break;
				
			case 4:
				parser = new ParserToPassword4x4();
				break;
				
			case 6:
				parser = new ParserToPassword6x6();
				break;
				
			default:
				parser = null;
				
		}
		
		return parser;
	}
}
