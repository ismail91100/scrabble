

public class Case{

		private Caractere c;
		private Position coor;
		
		
		public Case(int x, int y){
			this.c=new Caractere(' ');;
			this.coor=new Position(x, y);
			
		}
		
		public Case(Position coor){
			this.c=new Caractere(' ');
			this.coor=coor;
			
		}
		public Case(Caractere c, Position p){
			this.c=c;
			this.coor=p;
			
		}
		


		public Position getCoor() {
			return coor;
		}

		public void setCoor(Position coor) {
			this.coor = coor;
		}

		public void setCase(Caractere c) {
			this.c = c;
		}

		public boolean isPlacedOn(Case p){
			boolean tmp= false;
			if(this.coor.isEqual(p.coor))
				tmp=true;
			return tmp;
		}
		public boolean isFill(Position p){
			boolean tmp=false;
			if(this.c.equals(' ')&& this.coor.isEqual(p)) tmp=true;
			return tmp;
		}
		
		public String toString(){
			return this.c.toString()+this.coor.toString();
		}
		

}

