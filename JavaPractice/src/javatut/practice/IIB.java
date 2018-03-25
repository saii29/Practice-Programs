package javatut.practice;

public class IIB {
	int i;

	{
		int j;
		System.out.println("First IIB Block");
	}

	{
		System.out.println("Second IIB Block");
	}

	IIB(int j) {
		super();
		System.out.println("First Constructor");
	}
	
	IIB() {
		System.out.println("Second Constructor");
	}
	
	IIB(int j, int i) {
		this(5);
		System.out.println("Third Constructor");
	}
	
	public static void main(String[] args) {
		IIB a = new IIB(50);	// IIB called in first constructor only
		System.out.println("");
		IIB b = new IIB();
		b.i = 5;
		//b.j = 4; // not visible - compile time error
		
		System.out.println("");
		IIB c = new IIB(2,4); // IIB called in second constructor because of this()
		
	}
}