package module.grid;

public abstract class Grid implements GridInterface {
	public String[][] elements;
	public int rows, collumns;
	public int itrows, itcollumns;

	public Grid() {
	}

	public Grid(int rows, int collumns) {
		this.rows = rows;
		this.collumns = collumns;
		this.itrows = 0;
		this.itcollumns = 0;
		this.elements = new String[this.rows][this.collumns];
	}

	public void convert() {

	}

	public void getElements() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < collumns; j++) {
				System.out.print(elements[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

	/* Pegar coluna da grid */
	public String getCollumn(int position, int orientation) {

		position -= 1;
		String result = "";
		
		if (orientation > 0) {
			for (int i = 0; i < this.collumns; i++) {
				result += this.elements[i][position];
			}
		} else {
			for (int j = this.collumns - 1; j >= 0; j--) {
				result += this.elements[j][position];
			}
		}

		return result;
	}

	public String getLine(int position, int orientation) {
		
		position -= 1;
		String result = "";
		
		if (orientation > 0) {
			for (int i = 0; i < this.rows; i++) {
				result += this.elements[position][i];
			}
		} else {
			for (int j = this.rows - 1; j >= 0; j--) {
				result += this.elements[position][j];
			}
		}
		
		return result;
	}

	public String getDiagonal(int type, int orientation) {
		
		String result = "";
		
		/*Diagonal Principal*/
		if(type == 1){
			
			if(orientation >= 0){
				for (int i = 0; i < this.rows; i++) {
					for (int j = 0; j < this.collumns; j++) {
						if (i == j) {
							result += this.elements[i][j];
						}
					}
				}
			}
			else{
				for (int i = this.rows - 1; i >= 0; i--) {
					for (int j = this.collumns - 1; j >= 0; j--) {
						if (i == j) {
							result += this.elements[i][j];
						}
					}
				}
			}
			
		}
		
		/*Diagonal Secundária*/
		else if (type == 2){
			
			if(orientation >= 0){
				for (int i = 0; i < this.rows; i++) {
					for (int j = 0; j < this.collumns; j++) {
						if (i + j == this.rows - 1) {
							result += this.elements[i][j];
						}
					}
				}
			}
			else{
				for (int i = this.rows - 1; i >= 0; i--) {
					for (int j = this.collumns; j >= 0; j--) {
						if (i + j == this.rows - 1) {
							result += this.elements[i][j];
						}
					}
				}
			}
			
		}

		return result;
	}

}
