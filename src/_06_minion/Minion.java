package _06_minion;
public class Minion{
	
	private String name;
	private int eyes; 
		private String color; 
		private String master;
		public Minion(String name, int eyes, String color, String master) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.eyes = eyes;
			this.color = color;
			this.master = master;
		}
		
		public int getEyes() {
			return eyes;
		}
		public String getColor() {
			return color;
		}
		public String getMaster() {
			return master;
		}
		public void setEyes(int eyes) {
			this.eyes = eyes;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public void setMaster(String master) {
			this.master = master;
		}
		public String getName() {
			// TODO Auto-generated method stub
			return  name;
			
		}
		public void setName(String name) {
			this.name = name;
		}
}

