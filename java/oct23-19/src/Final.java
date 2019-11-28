
public class Final {



	String name;
	int rollno;
	final String cname = "google";
	final int cid;

	Final(String name, int rollno, int cid) {
		this.name = name;
		this.rollno = rollno;
		this.cid = cid;


	}



	final void printDetails() {
		System.out.println("Hola "+name+" welcome to " +cname);
	}


	final void printDetails(String name) {

		System.out.println("Hi "+name+ " welcome to "+cname);


	}



	

}
