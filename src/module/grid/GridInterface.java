package module.grid;

public interface GridInterface {
    
    public void getLine(int init, int orientation);
    public void getCollumn(int init, int orientation);
    public void getDiagonal(char type, int orientation);
    public void addElement(String elment);
    public void getElements();
    
    
    
}
