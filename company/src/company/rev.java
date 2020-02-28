package company;


	import java.util.Scanner;

	public class rev {

		public static void main(String[] args) {
			int i,j,k;
			char ch;
			
			for(i=1;i<=5;i++) {
				ch='a';
				for(j=5;j>1;j--) {
					System.out.print(" ");
				}
				for(k=1;k<=i;k++) {
					System.out.print(ch);
					ch++;
				}
				System.out.println();
					
				
			}
		}
		

}
