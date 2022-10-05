package sddvops.dv102_cwf;

public class App 
{
	private double length;
	private double area;
	
		 
		public App(double length) {
			super();
			this.length = length;		
						}
	 
		public double getLength() {
			return length;
		}
		
		public void setLength(double length) {
			this.length = length;
		}
		
		public double getArea() {
			return area;
		}
		
		public void setArea(double area) {
			this.area = area;
		}

		public double calcArea() {
			double root;
			root = Math.sqrt(3)/4;			
			area = root * length * length;
			 
			return area;
			
		}
		
		public double calcLength(double area) {
			this.area = area; 
			
			double root;
			root = Math.sqrt(3)/4;			
			
			double result;
			
			result = Math.sqrt (area / root);
			//area = root * length * length;
			 
			return result;
			
		}
		
		public double calcVolume() {
			double root;
			root = Math.sqrt(3)/4;			
			area = root * length * length;
			double volume;
			volume = area * length * 1/3;
			return volume;			

			
		}
		
		
}