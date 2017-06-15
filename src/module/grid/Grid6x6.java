package module.grid;

public class Grid6x6 extends Grid {
	
	public Grid6x6() {
		super(6, 6);
	}

	public Grid6x6(String[][] elements) {
		super(6, 6);
		this.elements = elements;
	}

	public void getElements() {
		System.out.println("Grid de " + this.collumns + " colunas e " + this.rows + " linhas");
		super.getElements();
	}

}
