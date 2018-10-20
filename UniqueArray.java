import java.io.*; 
import java.util.Scanner; 
class UniquearrayValay 
{ 
	static int minSum(int arrayVal[], int n) 
	{ 
		int sum = arrayVal[0]; 
	
		for (int i = 1; i < n; i++) 
		{ 
			if (arrayVal[i] == arrayVal[i - 1]) {		
				int j = i; 
				while (j < n && arrayVal[j] <= arrayVal[j - 1]) 
				{		 
					arrayVal[j] = arrayVal[j] + 1; 
					j++; 
				} 
			} 
			sum = sum + arrayVal[i]; 
		} 
	
		return sum; 
	} 
	
	public static void main (String[] args) 
	{ 
	 Scanner s=new Scanner(System.in);

        System.out.println("Enter number of elements");

        int n=s.nextInt();

        int arrayVal[]=new int[n];

        System.out.println("Enter elements");

        for(int i=0;i<n;i++){
            arrayVal[i]=s.nextInt();
		}

		//int arrayVal[] = { 2, 2, 3, 5, 6 }; 
		//int n = arrayVal.length; 
		System.out.println(minSum(arrayVal, n)); 
	} 
} 

