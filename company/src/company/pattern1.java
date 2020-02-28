package company;


	import java.util.Scanner;

	public class pattern1{

		public static void main(String[] args) {
			int i,j,k,a;
			Scanner s=new Scanner(System.in);
			for(i=1;i<=5;i++) {
				for(j=1;j<=i;j++) {
					if(j%4!=0)
						System.out.print(j);
					else 
						System.out.print(j+1);
				}
				for(k=4;k>=1;k--) {
					System.out.print(" ");
				}
				System.out.println();
			
			// TODO Auto-generated method stub

		}

		}

}
