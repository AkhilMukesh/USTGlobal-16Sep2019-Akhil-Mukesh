
public class Overiding {

	public static void add(int a, int b) {
		// TODO Auto-generated method stub
			System.out.println("add(int a,int b) method");
	}
	
	public static void add(int a, byte b) {
		// TODO Auto-generated method stub
		System.out.println("add(int a,byte b) method");
	}
	
	public static void main(String[] args) {
		System.out.println("this is main method");
		main(10);
		add(10,20);
		add(20,30);
	}
	
	public static void main(int a) {
		
	}
	
}
