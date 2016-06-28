package Practice;

import java.util.Stack;

public class ReverseStackRecursively {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
       
		Stack<Integer>s=reverseStack(stack);
		while(!s.isEmpty()){
			
			System.out.print(s.pop());
		}
	}

	
	
	public static Stack<Integer> reverseStack(Stack<Integer>stack){
		if(stack.isEmpty())
			return stack;
		else{
			int temp=stack.pop();
			reverseStack(stack);
			stack.push(temp);
		}
		
		return stack;
		
		
	}
}
