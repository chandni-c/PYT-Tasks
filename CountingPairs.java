import java.util.*; 
import java.io.*; 

class CountingPairs { 

	static int countPairs(List<Integer> listArray, int n, int k) 
	{ 
		int count = 0; 

		for (int i = 0; i < n; i++) 
		{ 
			for (int j = i + 1; j < n; j++) 
				if (listArray.get(i) - listArray.get(j) == k || 
					listArray.get(j) - listArray.get(i) == k) 
					count++; 
		} 
		return count; 
	} 

	public static void main(String args[]) 
	{ 
	Scanner s=new Scanner(System.in);

        System.out.println("Enter length of an array");

        int n=s.nextInt();

        System.out.println("Enter value of K");

        int k=s.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter elements");

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
		}
		List<Integer> listArray = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			if (!listArray.contains(arr[i]))
			listArray.add(arr[i]);
		}
		n = listArray.size();
		System.out.println("Count of pairs with given diff is "+ countPairs(listArray, n, k)); 
	} 
} 

