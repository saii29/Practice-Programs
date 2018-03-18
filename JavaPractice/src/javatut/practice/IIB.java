package javatut.practice;

public class IIB {
	int i;

	{
		System.out.println("First IIB Block");
	}

	{
		System.out.println("Second IIB Block");
	}

	IIB(int j) {
		super();
		System.out.println("First Constructor");
	}
	
	IIB(int j, int i) {
		this();
		System.out.println("First Constructor");
	}

	IIB() {
		System.out.println("Second Constructor");
	}

	public static void main(String[] args) {
		IIB a = new IIB(50);
		System.out.println("");
		IIB b = new IIB();
		System.out.println("");
		IIB c = new IIB(2,4);
		
	}
}