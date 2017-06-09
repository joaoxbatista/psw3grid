package app;
import module.grid.Grid9;
import module.grid.GridInterface;
public class Main {

    public static void main(String[] args) {
        
        GridInterface grid = new Grid9();
        
        grid.addElement("Manga");
        grid.addElement("Morango");
        grid.addElement("Banana");
        
        grid.addElement("Abacaxi");
        grid.addElement("Cenoura");
        grid.addElement("Laranja");
        
        grid.addElement("Abobora");
        grid.addElement("Cebola");
        grid.addElement("Abacate");
        
        grid.getElements();
       
    }

}
