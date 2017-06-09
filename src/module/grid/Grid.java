package module.grid;

import java.util.ArrayList;

public abstract class Grid implements GridInterface {
	public String[][] elements;
	public int rows, collumns;
	public int itrows, itcollumns;
	
	public Grid(){}
	
	public Grid(int rows, int collumns){
		
		this.rows = rows;
		this.collumns = collumns;
		this.itrows = 0;
		this.itcollumns = 0;
		
		this.elements = new String[this.rows][this.collumns];
	}
	
	public void getElements(){
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < collumns; j++){
				System.out.print(elements[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	
	public void getLine(int position, int orientation) {

		System.out.println("Linha " + position);
		
		if(orientation >= 0){
			System.out.println("Orientação crescente");
		}else{
			System.out.println("Orientação decrescente");
		}

	}
	
	public void getCollumn(int position, int orientation){
		System.out.println("Coluna " + position);
		
		if(orientation >= 0){
			System.out.println("Orientação crescente");
		}else{
			System.out.println("Orientação decrescente");
		}
	}

}
