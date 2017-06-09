package module.grid;

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
	
	public void convert(){
		
	}
	
	public void getElements(){
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < collumns; j++){
				System.out.print(elements[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	
	/*Pegar coluna da grid*/
	public void getCollumn(int position, int orientation) {
		
		System.out.println("Collumn " + position);
		position -=1;
		
		if(orientation > 0){
			for(int i = 0; i < this.collumns; i++){
				System.out.print(this.elements[i][position]);
			}
		}else{
			for(int j = this.collumns-1; j >= 0; j--){
				System.out.print(this.elements[j][position]);
			}
		}
		
		System.out.println("\n");
	}
	
	public void getLine(int position, int orientation){
		position -=1;
		System.out.println("Line " + position);
		
		
		if(orientation > 0){
			for(int i = 0; i < this.rows; i++){
				System.out.print(this.elements[position][i]);
			}
		}else{
			for(int j = this.rows-1; j >= 0; j--){
				System.out.print(this.elements[position][j]);
			}
		}
		
		System.out.println("\n");
	}
	
	public void getDiagonal(){
		System.out.println("Diagonal Principal");
		for(int i = 0; i < this.rows; i++){
			for(int j = 0; j < this.collumns; j++){
				if(i == j){
					System.out.print(this.elements[i][j]);
				}
			}
		}
		
		System.out.println("\n");
		
		System.out.println("Diagonal Principal Reversa");
		for(int i = this.rows-1; i >= 0; i--){
			for(int j = this.collumns-1; j >= 0; j--){
				if(i == j){
					System.out.print(this.elements[i][j]);
				}
			}
		}
		
		System.out.println("\n");
		
		System.out.println("Diagonal Secundária");
		for(int i = 0; i < this.rows; i++){
			for(int j = 0; j < this.collumns; j++){
				if(i+j == this.rows-1){
					System.out.print(this.elements[i][j]);
				}
			}
		}
		
		System.out.println("\n");
		
		System.out.println("Diagonal Secundária Reversa");
		for(int i = this.rows-1; i >= 0; i--){
			for(int j = this.collumns; j >= 0; j--){
				if(i+j == this.rows-1){
					System.out.print(this.elements[i][j]);
				}
			}
		}
		
		System.out.println("\n");
	}

}
