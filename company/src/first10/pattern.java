package first10;
public class pattern {

	public static void main(String[] args) {
		int i,j,k;boolean x=true,y=false;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print(y);
				}
				else {
					System.out.print(x);
				}
			}
			for(k=4;k>=1;k--) {
				System.out.print(" ");
			}
			System.out.println();
		}
}
}