package javatut.practice;
public class Constructor
{
	Constructor()
     {
          //By Default, Compile will keep super() calling statement here.
          System.out.println("First Constructor");
     }
	Constructor(int i)
     {
          this();
          // It gives compile time error
          System.out.println("gg--" +i );
     }
     
     public static void main(String[] args) {
    	 Constructor b = new Constructor(1);
	}
}

class AA
{
     AA()
     {
          //By Default, Compile will keep super() calling statement here.
          System.out.println("First Constructor");
     }
     AA(int i)
     {
          //Compiler will not keep any statement here
          super();
          System.out.println("Second Constructor");
     }
     AA(int i, int j)
     {
          //Compiler will not keep any statement here
          this();
          System.out.println("Third Constructor");
     }
     AA(int i, int j, int k)
     {
          System.out.println("Fourth Constructor");
          // super(); It will give error if you keep super() here
     }
}