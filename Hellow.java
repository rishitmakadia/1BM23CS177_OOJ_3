import java.util.Scanner;

class Hellow{
	public static void main(String args[]) {
	System.out.println("Hello World");
	for(int i=0; i<args.length; i++) {
		System.out.println("args[" + i + "]: " + args[i]);
	}
//	 Area of Rectangle
		System.out.println("Area of Rectangle 9 X 5 ");
		int a=9, b=5;
		System.out.println(a*b);

//	 Area of Circle
		Scanner abc = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		float d = abc.nextInt();
		System.out.println("Area of Circle ");
		float e=3.14f;
		float area=e*d*d;
		System.out.println(area);
}
}
