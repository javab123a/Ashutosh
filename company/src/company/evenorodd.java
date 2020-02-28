package company;

 import java.util.Scanner;

 public class evenorodd{

	public static void main(String[] args) {
		int age;
		Scanner s=new Scanner (System.in);
		System.out.println("enter age");
		age=s.nextInt();
		if(age<=17) {
			System.out.println("not eligible to vote");
		}
		else {
			System.out.println("eligible to vote");
		}
		// TODO Auto-generated method stub

	}


}
