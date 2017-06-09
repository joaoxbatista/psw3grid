
package module.grid;

public class Grid3x3 extends Grid {

	public Grid3x3() {
		super(3, 3);
	}

	public Grid3x3(String[][] elements) {
		super(3, 3);
		this.elements = elements;
	}

	public void getElements() {
		System.out.println("Grid de " + this.collumns + " colunas e " + this.rows + " linhas");
		super.getElements();
	}

	

	public void getDiagonal(char type, int orientation) {

	}

	public void addElement(String elment) {

	}

}
