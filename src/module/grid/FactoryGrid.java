package module.grid;

public class FactoryGrid {

	public static Grid create(int dimension){
		Grid grid;
		switch(dimension){
			
			case 3:
				grid = new Grid3x3();
				break;
				
			case 4:
				grid = new Grid4x4();
				break;
			
			case 6:
				grid = new Grid6x6();
				break;
				
			default:
				grid = null;
				
		}
		
		return grid;
	}
}
