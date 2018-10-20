import java.util.Stack; 
import java.util.Scanner; 
import java.lang.*;

class SuperStack extends Stack<Integer> 
{ 
	Stack<Integer> mainStack = new Stack<>(); 
	
	/*push*/
	void push(int x) 
	{ 
			super.push(x); 
			mainStack.push(x); 
	} 

	/*pop*/
	public Integer pop() 
	{ 
		int x = super.pop(); 
		mainStack.pop(); 
		return x; 
	} 
	
	/*Increment Value*/
	void inc(int e, int k){
		Stack<Integer> incrementStack = new Stack<>();
		int size = mainStack.size();
		for(int i=0;i<size;i++){
			int val = super.pop(); 
			mainStack.pop();
			incrementStack.push(val);
		}
		for(int j=0;j<e;j++){
			int val1 = incrementStack.pop();
			super.push(val1+k); 
			mainStack.push(val1+k);
		}
		if(incrementStack.size()>0){
			for(int n = 0;n<incrementStack.size();n++){
				int val1 = incrementStack.pop();
				super.push(val1); 
				mainStack.push(val1);
			}
		}
	}

	/*Get Value*/
	int getmainStack() 
	{ 
		int x = mainStack.pop(); 
		mainStack.push(x); 
		return x; 
	} 

	public static void main(String[] args) 
	{ 
		SuperStack s = new SuperStack(); 	
		Scanner sr=new Scanner(System.in);

        System.out.println("Enter number of elements");

        int n=sr.nextInt();

        System.out.println("Enter Values");

        for(int i=0;i<=n;i++){	//for reading array
            String newVal = sr.nextLine();
			String[] splited = newVal.split("\\s+");
			if(splited[0].equalsIgnoreCase("push")){
				s.push(Integer.parseInt(splited[1]));
				System.out.println(s.getmainStack());
			}
			else if(splited[0].equalsIgnoreCase("pop")){
				s.pop();
				if(s.size()>0)
					System.out.println(s.getmainStack());
				else
					System.out.println("EMPTY");
			}
			else if(splited[0].equalsIgnoreCase("inc")){
				s.inc(Integer.parseInt(splited[1]),Integer.parseInt(splited[2]));
				System.out.println(s.getmainStack());
			}
		}
		
	} 
} 