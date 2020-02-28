package company;

public class array2 {
	public static void main(String[] args) {
		int num[]= {78,76,76,79,70};
		int sum=0;
		int average=0;
	
		int grade ;
		for(int i=0;i<5;i++) {
			sum=sum+num[i];
			average=sum/5;
			
		}
		System.out.println(average);
		if(average>70) {
			System.out.println("grade is"+7);
		}
	}

}

