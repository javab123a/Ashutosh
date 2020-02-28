package company;



	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class data {
	String empid;
	String empname;
	float empbasic;
	float hra;
	float da;
	float tsal;
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	data()throws IOException{
		System.out.println("enter empid");
		empid=br.readLine();
		System.out.println("enter empname");
		empname=br.readLine();
		System.out.println("enter empbasic");
		empbasic=Float.parseFloat(br.readLine());
	}
	void disp() {
		System.out.println("empid="+empid+"empname="+empname+"empbasic="+empbasic+"total salary="+tsal);
	}
	float grosssalary() {
		hra=empbasic*(2);
		da=empbasic*(3);
		tsal=empbasic+hra+da;
		
		return tsal;
	}


		public static void main(String[] args)throws IOException {
			data e1=new data();
			data e2=new data();
			data e3=new data();
		
		System.out.println(e1.grosssalary());	
		System.out.println(	e2.grosssalary());
		System.out.println(e3.grosssalary());
		e1.disp();
		e2.disp();
		e3.disp();
		}

	}

