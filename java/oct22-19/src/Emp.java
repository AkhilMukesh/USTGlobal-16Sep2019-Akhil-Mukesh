
public class Emp {
	
	String name;
	int age;
			Emp(String name, int age){
				this.name = name;
				this.age = age;
}
			void printDetails() {
				System.out.println("emp name is "+name);
				System.out.println("emp age is "+age);
			}
			public static void main(String[] args) {
				Emp e = new Emp("AKhil",21);
				e.printDetails();
				Emp e1 = new Emp("mukesh",22);
				e1.printDetails();
				
			}
			
			
			
}
