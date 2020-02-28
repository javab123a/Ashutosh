package company;


	import java.util.Scanner;

	public class leapyear {	public static void main(String[] args) {
		   float days;
			Scanner s =new Scanner(System.in);
			System.out.println("enter number of days");
			days=s.nextInt();
			
			if(days%2==0) 
				System.out.println("year is an leap year");
			
			else {
				System.out.println("year is not a leap year");
			}
			// TODO Auto-generated method stub

		}



	}

