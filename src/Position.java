
public class Position {
	private int x;
	private int y;
	
	public Position(int x, int y){
		this.setX(x);
		this.setY(y);
	}

	public Position() {
		// TODO Auto-generated constructor stub
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	public String toString(){
		return "("+this.x+","+this.y+")";
	}
	public void incremanteX(){
		this.x+=1;
	}
	public void incremanteY(){
		this.y+=1;
	}
	public boolean isEqual(Position p){
		boolean tmp= false;
		if (this.x==p.x && this.y==p.y)
		tmp=true;
		return tmp;
	}
}
