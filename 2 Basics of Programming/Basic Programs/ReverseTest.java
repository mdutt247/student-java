class ReverseTest
{
	int rev=0;

	public int reverse(int n){
		while(n>0){
			rev = rev*10;
			rev = rev+n%10;
			n=n/10;
		}
		return rev;
	}

	public static void main(String a[]){
		ReverseTest o = new ReverseTest();
		System.out.println("Reverse of 1234 is: " + o.reverse(1234));
	}
}