import java.util.*;

class A extends RuntimeException{

	A(String s){
		super(s);
	}
}

class Acc{
	double bal;
	Acc(double bal){
				this.bal=bal;
			}
	void with(double amt){
		if(amt>bal)
			throw new A("Bikhari Sale!!!");

			else{
				bal-=amt;
				System.out.println("Sucessfully deducted amount !!! remaning bal :"+bal);
			} 
			

	}

	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Amount to be Deposited\n");
		double sa=sc.nextDouble();
		Acc ac=new Acc(sa);
		// ac.Ad(sa);
		System.out.println("Amount to be Withdrawn\n");
		double wi=sc.nextDouble();
		ac.with(wi);

	}
}
