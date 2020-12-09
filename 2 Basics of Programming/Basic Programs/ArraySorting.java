import java.lang.*;
import java.io.*;
import java.util.Arrays;

class ArraySorting
{
 public static void main (String args [])
{
     Arrays.sort(args);
     System.out.println("The array is now sorted as follows: \n");
     for (int i = 0; i < args.length; i++)
     	System.out.println(args[i]);
}
}