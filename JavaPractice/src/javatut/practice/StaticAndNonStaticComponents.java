package javatut.practice;
class A
{
     int nonStaticVariable;
     static int staticVariable;
 
     static void staticMethod()
     {
          System.out.println("staticMethod:" + staticVariable);
     //   System.out.println(nonStaticVariable);
     }
     
     static
     {
          System.out.println("staticBlock first:" + staticVariable);
     //   System.out.println(nonStaticVariable);
     }
 
     void nonStaticMethod()
     {
          System.out.println("nonStaticMethod:"+staticVariable);
          System.out.println("nonStaticMethod:"+nonStaticVariable);
     }
}
 
public class StaticAndNonStaticComponents
{
     public static void main(String[] args)
     {
          A.staticVariable = 10;
     //   A.nonStaticVariable = 10;
          A.staticMethod();
    //    A.nonStaticMethod();
 
          A a1 = new A();
          A a2 = new A();
 
          System.out.println("main a1:" + a1.nonStaticVariable);
          System.out.println("main a1:"+a1.staticVariable);
          a1.nonStaticMethod();
          a1.staticMethod();
 
          System.out.println("main a2:"+a2.staticVariable);
          a1.staticVariable = 20;
          System.out.println("main a2:"+a2.staticVariable);
     }
}