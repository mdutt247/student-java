/*
// File name: Text1.java

public interface Text1 {
    void test1(double d);
}

// File name: Text2.java
public interface Text2 {
	void test2(int i);
}
*/
// File name: ImplementTwoInterface.java
public class ImplementTwoInterface implements Text1, Text2 {

    public void test2(int i){
	System.out.println("Text1.test2(int): " + i);
	}
	public void test1(double d){
	System.out.println("Text2.test1(double): " + d);
	}

	public static void main(String aa[]){
	ImplementTwoInterface obj = new ImplementTwoInterface();
	obj.test2(22);
	obj.test1(2.0);
	}

}