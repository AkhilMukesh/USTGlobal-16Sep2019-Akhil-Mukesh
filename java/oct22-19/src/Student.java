
public class Student {
	
	String fname;
	String lname;
	int usn;
	int number;
	String location;
	
	Student(String fname, String lname, int usn, int number, String location) {
		
		
		
			this.fname = fname;
			this.lname = lname;
			this.usn = usn;
			this.number = number;
			this.location = location;
		
		this.StudentDetails();
		
		
	}
	
	
	 void StudentDetails() {
		System.out.println("Student First name is: "+this.fname);
		System.out.println("Student Last name is: "+this.lname);
		System.out.println("Student usn name is: "+this.usn);
		System.out.println("Student number name is: "+this.number);
		System.out.println("Student location name is: "+this.location);
	}
	
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Akhil","Mukesh",100,1253,"Banglore");
		Student s2 = new Student("Bill","Gates",101,1335,"America");
		Student s3 = new Student("Jackie","Chan",102,11523,"Japan");
		Student s4 = new Student("Salman","khan",103,1253,"China");
		Student s5 = new Student("Mukesh","Ambani",104,13533,"Germnay");
		Student s6 = new Student("Jeff","bezos",105,1243,"australia");
		Student s7 = new Student("Narendr","Modi",106,1223,"India");
		Student s8 = new Student("Manmohan","Singh",107,1523,"Delhi");
		Student s9 = new Student("Katrina","Kaif",108,1423,"Firangi");
		Student s10 = new Student("Alia","Bhatt",109,1233,"mumbai");
		
	
		
	}

}
