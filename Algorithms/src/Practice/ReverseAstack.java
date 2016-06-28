package Practice;

import java.util.Stack;

public class ReverseAstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		
		stack=reverseStack(stack);
		while (!stack.isEmpty()) {
             System.out.println(stack.pop());			
		}

	}
	
	
	public static Stack<Integer> reverseStack(Stack<Integer> s){
		if(!s.isEmpty()){
			int temp=s.pop();
			s=reverseStack(s);
			s.push(temp);			
		}
		
		return s;
	}

}
