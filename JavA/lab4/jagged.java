import java.util.*;
class Abc{

	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n,m;

		//TO read a input
		System.out.println("Enter The Size of Array");
		n=sc.nextInt();
		int arr[][]=new int[n][];
		System.out.println("Enter the no of Elements you want");
		for(int i=0;i<n;i++){
			m=sc.nextInt();
				arr[i]=new int[m];
		}

				System.out.println("Enter The Elements");	
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<arr[i].length;j+=1)
			arr[i][j]=sc.nextInt();
		}

			System.out.println("Entered array is\n");
			for(int i=0 ;i<n;i++)
			{
				for(int j=0 ; j<arr[i].length;j+=1)
				System.out.print(arr[i][j]+" ");
			System.out.println(" ");
			}
	
	}
}