
public class Emp2 {
	
	String name;
	int eid;
	long adharno;
	Emp2(String name, int eid, long adharno) {
		this.name = name;
		this.eid = eid;
		this.adharno = adharno;
		
	}


	Emp2(String name, int eid) {

		this.name = name;
		this.eid = eid;
	}
	
	
	void Emp2Details() {
		
		
		System.out.println("Hi " +name+ " welcome to UST Global");
		System.out.println("eid is "+ eid);
		System.out.println(adharno );
		
	}


	public static void main(String[] args) {

		Emp2 e = new Emp2("Akhil",007);
		Emp2 e1 = new Emp2("mukesh", 101,1001020);
		e.Emp2Details();
		e1.Emp2Details();
		

	}
}
