package module.grid;

public interface GridInterface {
    public String getLine(int init, int orientation);
    public String getCollumn(int init, int orientation);
    public String getDiagonal(int type, int orientation);
    public void getElements();
}
