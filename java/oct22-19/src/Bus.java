
public class Bus {
	
		int seats;
		String color;
		
	
		Bus(int seats, String Color){
			
			this.seats = seats;
			this.color = Color;
			
		}
	
		
		Bus() {
			
			this(40);
			
		}
	
	Bus(int seats){
		
		this(seats,"red");
		
	}
	
	void busDetails() {
		System.out.println("Welcome to Redbus, bus seat capability is "+seats);
		System.out.println("Welcome to Redbus, bus seat color  is "+color);
		
	}
	
	public static void main(String[] args) {
		Bus b = new Bus();
		b.busDetails();
		
		Bus b1 = new Bus(50);
		b1.busDetails();
		
		Bus b2 = new Bus(60,"blue");
		b2.busDetails();
	
	}
	
	
	
	
	
	
	
	
	
	

}
