
public class TestA {

	static int a;
	static
	{
		a=10;
		System.out.println("Static block 1");
	}

	TestA() {
		System.out.println("Staic Test() Constrcutor");
	}
	
	public static void main(String[] args) {
		TestA t = new TestA();
		System.out.println("a is: "+a);

	}

	static {
		System.out.println("staic block 2");
	}
}
