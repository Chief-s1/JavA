import java.util.*;
class Abc{

	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n,m;

		//TO read a input
		System.out.println("Enter The Size of Array");
		n=sc.nextInt();
		System.out.println("Enter Size of Coloum");
		m=sc.nextInt();
		int arr[][]=new int[n][m];
				System.out.println("Enter The Elements\n");	
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<m;j+=1)
			arr[i][j]=sc.nextInt();
		}

			System.out.println("Entered array is\n");
			for(int i=0 ;i<n;i++)
			{
				for(int j=0 ; j<m;j+=1)
				System.out.print(arr[i][j]+" ");
			System.out.println(" ");
			}
	
	}
}