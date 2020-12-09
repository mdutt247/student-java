public class Scope
{

static int i=35;

public static void main(String a[])
{
 int i=45;
 someMethod();
}

public static void someMethod()
{
 System.out.println(i);
}
}

