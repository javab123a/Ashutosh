package company;

import java.util.Scanner;

public class add1 {


	public static void main(String[] args) {
		int x;
		int y;
		int z; 
		int sub;
		int div;
		int multi;
	Scanner	s= new Scanner(System.in);

		System.out.println("enter two number");
		 x= s.nextInt();
		 y=s.nextInt();
		
		z=x+y;
		System.out.println(z);
		sub = x-y;
		System.out.println(sub);
		div=x/y;
		System.out.println(div);
		multi=x*y;
		System.out.println(multi);
		// TODO Auto-generated method stub

	}

}
