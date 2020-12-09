class Test
{
  int x = 10;
  public void display()
  {
    System.out.println("Hello 1");
  }
}
public abstract class AbstractClassWithMain
{
 public static void main(String args[])
 {                        
   Test t1 = new Test();
   System.out.println("From abstract class main(): " + t1.x);
   t1.display();
 }
}