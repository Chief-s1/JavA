class Abc{

 public static void main(String args[])
 {
 System.out.println("-----------------------------------------");
 Account a1=new Account();
 a1.Disp();
 System.out.println("-----------------------------------------");
 
 Account a2=new Account(99000,"16622172","Swayam Manori");
 a2.Disp();
 a2.Dep(7000);
 a2.Wit(85000);
 System.out.println("-----------------------------------------");
 
 }
 
 
        }
 class Account{
 	int amt;
 	String acc_no;
 	String name;
 		  
 		  Account(){
 		  amt=100000;
 		  acc_no="16032121004521";
 		  name="Shivam Manori";
 		  }
 
 	Account(int amo, String acno , String s1)
  {
	amt= amo;
	acc_no=acno;
	name=s1;

  }
		public void Dep(int aa)
		{
		System.out.println("Amount Deposited:"+aa);
 			amt+=aa;
		Cb();
		} 
 	
 			public void Wit(int w)
 			{
 			if(w<amt){
 			System.out.println("Amount Withdrawled:"+w);
 			amt-=w;
 			Cb();
 			}
 			else{
 			System.out.println("Not Enough Balance Available");
 			}
 			}
 			
 				public void Cb()
 				{
 				System.out.println("Available Amount :"+amt);
 				}
 				  public void Disp()
					{
					System.out.println("Account Number:"+acc_no);
					  System.out.println("Name:"+name);
					  System.out.println("Total Amount in Account:"+amt);
					}

 }
