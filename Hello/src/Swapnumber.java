
public class Swapnumber {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("before swapping:"+a+"is:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping:"+a+"is:"+b);

	}

}
