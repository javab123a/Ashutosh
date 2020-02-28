package company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class income {
	String name;
	String id;
	float basicsal;
	double hra;
	double da;
	double tsal;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	income()throws IOException{
		System.out.println("enter name");
		name=br.readLine();
		System.out.println("enter id");
		id=br.readLine();
		System.out.println("enter basicsal");
		basicsal=Float.parseFloat(br.readLine());
	}
	void disp() {
		System.out.println("name="+name+"/n"+"id="+id+"/n"+"basicsal="+basicsal+"/n"+"total="+tsal);
	}
	double gross(){
		if(basicsal>10000) {
			hra=basicsal*(0.25);
			da=basicsal*(0.1);
		}
		else {
			hra=(float) (basicsal*(0.1));
			da=(float) (basicsal*(0.05));
		}
		tsal=basicsal+hra+da;
		return tsal;
	}

	public static void main(String[] args)throws IOException {
		income i1=new income();
		income i2=new income();
		income i3=new income();
		System.out.println(i1.gross());
		System.out.println(i2.gross());
		System.out.println(i3.gross());
		i1.disp();
		i2.disp();
		i3.disp();
	}
}
