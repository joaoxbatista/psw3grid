package app;
import module.grid.Grid3x3;
import module.grid.GridInterface;
public class Main {

    public static void main(String[] args) {
        
    	String[][] sequencia = {{"a", "2", "3"}, {"#", "s", "r"}, {"s", "s", "m"}};
    	
        GridInterface grid = new Grid3x3(sequencia);
    
        grid.getElements();
        grid.getLine(1, -1);
        grid.getCollumn(1, -1);
    }

}
