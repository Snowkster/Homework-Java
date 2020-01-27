package src.com.game.pieaces;

public abstract class Peice {

	public String color;
	public int power;
	public int id;
	public int row;
	public int col;
	public Peice (String color, int row, int col) {
		
		this.row = row;
		this.col = col;
		this.color = color;
		
	}
	public abstract void move(int moveRow, int moveCol);
	
	public abstract void attack(int attackRow, int attackCol);
}
