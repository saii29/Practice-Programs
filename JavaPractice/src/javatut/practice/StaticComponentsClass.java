package javatut.practice;
class StaticComponents
{
     static int staticVariable;
 
     static
     {
          System.out.println("StaticComponents SIB --- " + StaticComponents.staticVariable);
          staticVariable = 10;
     }
 
     static void staticMethod()
     {
          System.out.println("From StaticMethod");
          System.out.println(staticVariable);
     }
}
 
public class StaticComponentsClass
{
     static
     {
          System.out.println("MainClass SIB");
          StaticComponents.staticVariable = 100;
          System.out.println("MainClass SIB " +StaticComponents.staticVariable);
     }
 
     public static void main(String[] args)
     {
         //Static Members directly accessed with Class Name
          StaticComponents.staticVariable = 20;
          StaticComponents.staticMethod();
     }
}