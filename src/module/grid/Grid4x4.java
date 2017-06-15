package module.grid;

public class Grid4x4 extends Grid {
	
	public Grid4x4() {
		super(4, 4);
	}

	public Grid4x4(String[][] elements) {
		super(4, 4);
		this.elements = elements;
	}

	public void getElements() {
		System.out.println("Grid de " + this.collumns + " colunas e " + this.rows + " linhas");
		super.getElements();
	}

}
